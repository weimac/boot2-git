package com.wk.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.wk.po.User;
import com.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Description:
 * @Company:qianfeng
 * @Auther:weiMac
 * @Date:2019/11/13
 * @Time:17:42
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    @ResponseBody
    public List<User> selectList(){

        return userService.selectList();
    }

    /**
     * 显示所有的用户信息
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "userList")
    public ModelAndView selectUserList(){
        ModelAndView modelAndView=new ModelAndView();
        List<User> list=userService.selectList();
        modelAndView.addObject("listUser",list);
        //templates/user/list    .html
        modelAndView.setViewName("user/list");
        modelAndView.addObject("name","lisi");
        return modelAndView;

    }
    /**
     * 进入 添加页面
     */
    @RequestMapping("add")
    public String addPage(){
        return "user/add";
    }

    /**
     * 添加功能
     * @param user
     * @return
     */
    @RequestMapping("addTo")
    public String addPageTo(User user){
        userService.addUser(user);
        return "redirect:userList"; //返回字符串 /或者返回方法
    }

    /**
     * 进入 信息详情页面
     */
    @GetMapping(value = "view/{id}")
    public String selectUserById(@PathVariable("id") Integer id, HttpSession s){

        User u=userService.selectByPrimaryKey(id);

        System.out.println(u);

        s.setAttribute("user",u);

        return "user/view";
    }
    /**
     * 删除功能
     */
    @PostMapping(value = "delete")
    @ResponseBody
    public String delUserById(@RequestParam("id") Integer id){

        int num = userService.deleteByPrimaryKey(id);

        System.out.println(num);

        return ""+num;
    }
    /**
     * 更新功能
     */
    @RequestMapping("update")
    public String UpdatePage(User user){
        System.out.println(user);
        int num=userService.updateByPrimaryKeySelective(user);
        System.out.println(num);
        return "redirect:userList"; //返回字符串 /或者返回方法
    }

}

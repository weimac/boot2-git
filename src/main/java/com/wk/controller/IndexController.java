package com.wk.controller;

import com.wk.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Description:
 * @Company:qianfeng
 * @Auther:weiMac
 * @Date:2019/11/13
 * @Time:19:53
 */
@Controller
public class IndexController {

    @GetMapping("index")
    public String index(Map<String,Object> map){

        map.put("msg","我的第一个Thymeleaf数据");
        map.put("msg1","<span>是否<span style='color:red'>尊重</span>我</span>");
        map.put("msg2","<h2>是否尊重我</h2>");
        User u=new User();
        u.setName("徐亮");
        u.setUname("xuliang");

        map.put("user",u);
        return "index";
    }
    @GetMapping("demo/a")
    public String aPage(){
        return "demo/a";
    }

    @GetMapping("b")
    public String bPage(){
        return "b";
    }
}

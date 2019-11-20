package com.wk.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;

    private String uname;

    private String upass;

    private String name;

    private Byte status;

    private static final long serialVersionUID = 1L;

}
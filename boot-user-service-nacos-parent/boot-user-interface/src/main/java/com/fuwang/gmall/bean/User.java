package com.fuwang.gmall.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {
    private static final long serialVersionUID = -8120417489850347478L;

    private String userId;

    private String userName;

}

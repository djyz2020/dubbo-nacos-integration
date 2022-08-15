package com.fuwang.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuwang.gmall.bean.User;
import com.fuwang.gmall.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference(interfaceName = "userService")
    private UserService userService;

    @RequestMapping("/getUserList")
    public Object getUserList() throws Exception {
        List<User> userList = userService.getUserList();
        if (userList.size() == 0) {
            log.info("未查询到信息！");
        }
        return userList;
    }

}

package com.fuwang.gmall.service;

import com.alibaba.fastjson.JSON;
import com.fuwang.gmall.bean.User;
import com.fuwang.gmall.mapper.IUserDao;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@DubboService(interfaceName = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private IUserDao iUserDao;

    @Override
    public List<User> getUserList() throws Exception {
        List<User> userList = iUserDao.getUserList();
        log.info("userList={}", JSON.toJSON(userList));
        return userList;
    }

}

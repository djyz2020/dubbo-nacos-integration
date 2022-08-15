package com.fuwang.gmall.mapper;

import com.fuwang.gmall.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {

    List<User> getUserList();

}

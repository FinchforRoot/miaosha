package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.Model.UserModel;

public interface UserService {
    //通过用户id获取用户对象的方法
    UserModel getUserById(Integer id);
    //对应用户注册处理的流程
    void register(UserModel userModel) throws BusinessException;
    //对应用户登录校验方法
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}

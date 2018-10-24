package com.lls.ly.test.service;

import com.lls.ly.test.mode.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Liyang
 * Date: 2018/10/21
 * Time: 15:11
 */
public class LoginService implements ILoginService{

    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void login() {
        User user = userService.getUserById(1L);
        System.out.println(user.toString() + "登录成功");
    }
}

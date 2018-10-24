package com.lls.ly.test.service;

import com.lls.ly.test.mode.User;

/**
 * User: Liyang
 * Date: 2018/10/21
 * Time: 15:05
 */
public interface IUserService {

    User getDemoUser();

    String printUser(User user);

    User getUserById(Long id);
}

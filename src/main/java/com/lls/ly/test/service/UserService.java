package com.lls.ly.test.service;

import com.lls.ly.test.mode.User;
import org.springframework.stereotype.Service;

/**
 * User: Liyang
 * Date: 2018/10/21
 * Time: 14:57
 */
public class UserService implements IUserService {

    public User getDemoUser() {
        return User.builder().id(1L).name("abc").sex(0).age(18).build();
    }

    @Override
    public String printUser(User user) {
        return user.toString();
    }

    @Override
    public User getUserById(Long id) {
        return getDemoUser();
    }
}

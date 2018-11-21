package com.lls.ly.test;

import com.lls.ly.test.service.ILoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Liyang
 * Date: 2018/10/21
 * Time: 14:55
 */
public class TestSpringStarter {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ILoginService loginService = (ILoginService) context.getBean("loginServiceImpl");
        loginService.login();
    }
}

package com.controller;

import com.po.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class UserController {
    @Autowired
    UserService personService;

    @RequestMapping("test.do")
    public String get(){
        List<User> users = personService.selectPersonList();
        for (User user : users) {
            System.out.println(user);
        }
        return "test";
    }
}

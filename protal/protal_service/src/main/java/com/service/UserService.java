package com.service;

import com.dao.UserMapper;
import com.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper personMapper;

    @Transactional
    public List<User> selectPersonList(){
        System.out.println("PersonService do..");
        return personMapper.selectPersonList();
    }
}

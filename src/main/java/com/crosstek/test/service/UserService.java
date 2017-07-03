package com.crosstek.test.service;

import com.crosstek.test.dao.UserMapper;
import com.crosstek.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WuDi on 2017/7/3 0003.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectUserById(){
       return userMapper.selectUserById(1);
    }
}

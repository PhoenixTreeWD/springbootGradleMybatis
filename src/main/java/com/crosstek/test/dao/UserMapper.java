package com.crosstek.test.dao;

import com.crosstek.test.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by WuDi on 2017/7/3 0003.
 */
@Repository
public interface UserMapper {
   User selectUserById(Integer id);
}

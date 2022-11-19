package com.ysy;

import com.ysy.mapper.UserMapper;
import com.ysy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 雍思杨
 * @Date 2022/10/22 10:57 （可以根据需要修改）
 * @Description:
 * @Version 1.0 （版本号）
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User>  queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }
}


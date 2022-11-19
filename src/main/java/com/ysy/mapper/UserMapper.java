package com.ysy.mapper;

import com.ysy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 雍思杨
 * @Date 2022/10/22 10:30 （可以根据需要修改）
 * @Description:
 * @Version 1.0 （版本号）
 */
//这个注解表示了这是一个mybatis的mapper类 Dao
@Mapper
@Repository   //被spring整合 是一个mybatis的mapper类
public interface UserMapper {

    int age=18;  //public static final int age =18;

    List<User> queryUserList();
    User queryUserById(int id);

    int addUser(User user);


    int updateUser(User user);
    int deleteUser(int id);
}

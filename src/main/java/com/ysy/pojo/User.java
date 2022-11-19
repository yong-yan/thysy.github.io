package com.ysy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 雍思杨
 * @Date 2022/10/22 9:08 （可以根据需要修改）
 * @Description:
 * @Version 1.0 （版本号）
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int userld;
    private String username;
    private String password;
}

package com.sung.java8.stream;

import com.google.common.base.Optional;
import lombok.Data;

/**
 * Created by sungang on 2017/8/15.
 */
@Data
public class User {

    /**
     * 用户编号
     */
    private long id;

    private String name;

    private int age;


    /**
     * 手机和邮箱不是一个人的必须有的，所以我们利用Optional定义。
     */
    private Optional<Long> phone;

    private Optional<String> email;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

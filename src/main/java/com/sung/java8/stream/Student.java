package com.sung.java8.stream;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sungang on 2017/8/15.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    /**
     * 学号
     */
    private long id;
    private String name;
    private int age;
    /**
     * 年级
     */
    private int grade;
    /**
     * 专业
     */
    private String major;
    /**
     * 学校
     */
    private String school;


}

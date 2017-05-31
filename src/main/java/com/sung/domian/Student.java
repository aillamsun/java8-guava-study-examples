package com.sung.domian;

import com.google.common.base.Objects;

/**
 * Created by sungang on 2017/5/31.
 */
public class Student {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String toString() {
//        return Objects.toStringHelper(this.getClass())
//                .add("id", id)
//                .add("name", name)
//                .add("age", age)
//                .omitNullValues().toString();
//    }
}

package com.sung.domian;

import java.util.Optional;

/**
 * Created by sungang on 2017/5/26.
 */
public class Person {

    private final String name;
    private final int age;
    private Optional<Person> parent = Optional.empty();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public java.util.Optional<Person> getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

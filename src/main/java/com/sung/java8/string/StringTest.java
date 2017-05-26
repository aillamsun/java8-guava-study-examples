package com.sung.java8.string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sungang on 2017/5/26.
 */
public class StringTest {


    @Test
    public void stringJoin(){

        List names=new ArrayList<String>();
        names.add("1");
        names.add("2");
        names.add("3");

        System.out.println(String.join(",", names));


        String[] arrStr=new String[]{"a","b","c"};
        System.out.println(String.join(",", arrStr));

    }


}

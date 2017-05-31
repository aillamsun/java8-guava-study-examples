package com.sung.guava.collections;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import java.util.Set;

/**
 * Created by sungang on 2017/5/31.
 *
 * 不可变集合
 *
 */
public class ImmutableSetTest {


    /**
     * 使用builder创建：
     */
    @Test
    public void builderTest(){
        Set<String> immutableNamedColors = ImmutableSet.<String>builder()
                .add("red", "green", "black", "white", "grey")
                .build();
        //immutableNamedColors.add("abc");
        for (String color : immutableNamedColors) {
            System.out.println(color);
        }
    }

    @Test
    public void ofTest(){
        Set<String> immutableNamedColors = ImmutableSet.of("red","green","black","white","grey");
        for (String color : immutableNamedColors) {
            System.out.println(color);
        }
    }

    @Test
    public void copyOfTest(){
        Set<String> immutableNamedColors =  ImmutableSet.copyOf(new String[]{"red","green","black","white","grey"});
        for (String color : immutableNamedColors) {
            System.out.println(color);
        }
    }
}

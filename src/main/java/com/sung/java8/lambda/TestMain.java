package com.sung.java8.lambda;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sungang on 2017/8/15.
 */
public class TestMain {





    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<Apple>() {
            {
                add(new Apple(1, Color.GREEN, 100, "四川"));
                add(new Apple(2, Color.RED, 101, "广西"));
                add(new Apple(3, Color.GREEN, 120, "陕西"));
            }
        };
        // 筛选苹果
        List<Apple> filterApples = filterApplesByAppleFilter(apples, new AppleFilter() {
            @Override
            public boolean accept(Apple apple) {
                // 筛选重量大于100g的红苹果
                return Color.RED.equals(apple.getColor()) && apple.getWeight() > 100;
            }
        });

        System.out.println(JSON.toJSONString(filterApples));
    }

    /**
     * 用户最开始的需求可能只是简单的希望能够通过程序筛选出绿色的苹果，于是我们可以很快的通过程序实现：
     *
     * @param apples
     * @return
     */
    public static List<Apple> filterGreenApples(List<Apple> apples) {
        List<Apple> filterApples = new ArrayList<>();
        for (final Apple apple : apples) {
            if (Color.GREEN.equals(apple.getColor())) {
                filterApples.add(apple);
            }
        }
        return filterApples;
    }


    /**
     * 将筛选条件封装成接口
     *
     * @param apples
     * @param filter
     * @return
     */
    public static List<Apple> filterApplesByAppleFilter(List<Apple> apples, AppleFilter filter) {
        List<Apple> filterApples = new ArrayList<>();
        for (final Apple apple : apples) {
            if (filter.accept(apple)) {
                filterApples.add(apple);
            }
        }
        return filterApples;
    }



    @Test
    public void test1(){
        List<Apple> apples = new ArrayList<Apple>() {
            {
                add(new Apple(1, Color.GREEN, 100, "四川"));
                add(new Apple(2, Color.RED, 101, "广西"));
                add(new Apple(3, Color.GREEN, 120, "陕西"));
            }
        };
        // 筛选苹果
        List<Apple> filterApples = filterApplesByAppleFilter(apples,(Apple apple) -> Color.RED.equals(apple.getColor()) && apple.getWeight() >= 100);
        //()->xxx   ()里面就是方法参数，xxx是方法实现
        System.out.println(JSON.toJSONString(filterApples));
    }
}

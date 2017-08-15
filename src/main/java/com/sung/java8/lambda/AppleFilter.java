package com.sung.java8.lambda;

/**
 * Created by sungang on 2017/8/15.
 */
public interface AppleFilter {

    /**
     * 筛选条件抽象
     *
     * @param apple
     * @return
     */
    boolean accept(Apple apple);

}

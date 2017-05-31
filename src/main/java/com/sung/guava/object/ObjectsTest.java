package com.sung.guava.object;

import com.google.common.base.Objects;
import org.junit.Test;

/**
 * Created by sungang on 2017/5/31.
 */
public class ObjectsTest {


    /**
     *
     */
    @Test
    public void equalsTest(){
        Object a = null;
        Object b = new Object();
        boolean aEqualsB = Objects.equal(a, b);
        System.out.println(aEqualsB);
    }
}

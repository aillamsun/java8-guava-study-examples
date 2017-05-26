package com.sung.guava.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

/**
 * Created by sungang on 2017/5/26.
 * <p>
 * BiMap提供了一种新的集合类型，它提供了key和value的双向关联的数据结构
 */
public class BiMapTest {


    /**
     * 反转的map
     */
    @Test
    public void testBiMapInverse() {

        BiMap<Integer, String> logfileMap = HashBiMap.create();
        logfileMap.put(1, "a.log");
        logfileMap.put(2, "b.log");
        logfileMap.put(3, "c.log");


        System.out.println("logfileMap:" + logfileMap);

        BiMap<String, Integer> filelogMap = logfileMap.inverse();

        System.out.println("filelogMap:" + filelogMap);
    }
}

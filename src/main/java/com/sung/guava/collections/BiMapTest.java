package com.sung.guava.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

/**
 * Created by sungang on 2017/5/26.
 * <p>
 * BiMap提供了一种新的集合类型，它提供了key和value的双向关联的数据结构
 *
 * Bimap数据的强制唯一性 会要求Value的唯一性。如果value重复了则会抛出错误：java.lang.IllegalArgumentException
 *
 */
public class BiMapTest {


    /**
     *  key 集合与 value 集合都有 HashMap 实现
     */
    static class HashBigMapTest{
        /**
         * 反转的map
         * inverse方法会返回一个反转的BiMap，但是注意这个反转的map不是新的map对象
         * 它实现了一种视图关联，这样你对于反转后的map的所有操作都会影响原先的map对象
         */
        @Test
        public void testInverse() {

            BiMap<Integer, String> logfileMap = HashBiMap.create();
            logfileMap.put(1, "a.log");
            logfileMap.put(2, "b.log");
            logfileMap.put(3, "c.log");


            System.out.println("logfileMap:" + logfileMap);

            BiMap<String, Integer> filelogMap = logfileMap.inverse();

            System.out.println("filelogMap:" + filelogMap);

            logfileMap.put(4,"d.log");

            System.out.println("logfileMap:"+logfileMap);
            System.out.println("filelogMap:"+filelogMap);
        }

        /**
         * 重复 Value  抛出异常
         */
        @Test
        public void testRepeatValue(){
            BiMap<Integer, String> logfileMap = HashBiMap.create();
            logfileMap.put(1, "a.log");
            logfileMap.put(2, "b.log");
            logfileMap.put(3, "c.log");
            logfileMap.put(4, "c.log");
        }


        /**
         * forcePut
         * 如果我们确实需要插入重复的value值，那可以选择forcePut方法。但是我们需要注意的是前面的key也会被覆盖了
         */
        @Test
        public void testForcePut(){
            BiMap<Integer,String> logfileMap = HashBiMap.create();
            logfileMap.put(1,"a.log");
            logfileMap.put(2,"b.log");
            logfileMap.put(3,"c.log");

            logfileMap.put(4,"d.log");
            logfileMap.forcePut(5,"d.log");
            System.out.println("logfileMap:"+logfileMap);
        }
    }

    /**
     *  key 与 value 都必须是 enum 类型
     */
    static class EnumBiMapTest{

    }

    /**
     * 不可修改的 BiMap
     */
    static class ImmutableBiMapTest{

    }

}

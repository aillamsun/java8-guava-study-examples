package com.sung.guava.string;

import static org.junit.Assert.*;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.List;
import java.util.Map;


/**
 * Created by sungang on 2017/5/31.
 */
public class JoinerTest {


    /**
     * list转换为字符串
     */
    @Test
    public void joinTest() {

        List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        String result = Joiner.on(",").join(names);

        assertEquals(result, "John,Jane,Adam,Tom");
    }

    /**
     * map转换为字符串
     */
    @Test
    public void whenConvertMapToString_thenConverted() {

        Map<String, Integer> salary = Maps.newHashMap();
        salary.put("John", 1000);
        salary.put("Jane", 1500);

        String result = Joiner.on(",").withKeyValueSeparator(" = ").join(salary);
        System.out.println(result);
    }

    /**
     * list转String，跳过null
     */
    @Test
    public void whenConvertListToStringAndSkipNull_thenConverted() {
        List<String> names = Lists.newArrayList("John", null, "Jane", "Adam", "Tom");
        String result = Joiner.on(",").skipNulls().join(names);
        System.out.println(result);
        assertEquals(result, "John,Jane,Adam,Tom");
    }

    /**
     * list转String，将null变成其他值
     */
    @Test
    public void whenUseForNull_thenUsed() {
        List<String> names = Lists.newArrayList("John", null, "Jane", "Adam", "Tom");
        String result = Joiner.on(",").useForNull("nameless").join(names);
        System.out.println(result);
        assertEquals(result, "John,nameless,Jane,Adam,Tom");
    }
}
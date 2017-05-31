package com.sung.guava.string;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sungang on 2017/5/26.
 */
public class StringsTest {

    @Test
    public void strings() {
        // Guava
        String s = getString();
        Strings.isNullOrEmpty(s);
        Strings.nullToEmpty(s);
        Strings.repeat("-", 70);

        List<String> parts = Arrays.asList("a", "b", "c", null);
        String joined = Joiner.on(", ").skipNulls().join(parts);
        assertThat(joined, is("a, b, c"));

        Splitter.MapSplitter splitter = Splitter.on(" ").withKeyValueSeparator(":");
        splitter.split("a:1 b:2"); // => Map {a=1, b=2}
    }


    /**
     * 获得两个字符串相同的前缀或者后缀
     */
    @Test
    public void commonPrefixTest() {
        String a = "com.jd.coo.Hello";
        String b = "com.jd.coo.Hi";
        String ourCommonPrefix = Strings.commonPrefix(a, b);
        System.out.println("a,b common prefix is " + ourCommonPrefix);
    }

    /**
     * 获得两个字符串相同的前缀或者后缀
     */
    @Test
    public void commonSuffixTest() {
        String c = "com.google.Hello";
        String d = "com.jd.Hello";
        String ourCommonPrefix = Strings.commonSuffix(c, d);
        System.out.println("a,b common prefix is " + ourCommonPrefix);
    }

    /**
     * Strings的padStart和padEnd方法来补全字符串
     */
    @Test
    public void padEndTest() {
        int minLength = 4;
        String padEndResult = Strings.padEnd("123", minLength, '0');
        System.out.println("padEndResult is " + padEndResult);
    }


    @Test
    public void padStartTest() {
        String padEndResult = Strings.padStart("1", 2, '0');
        System.out.println("padStartResult is " + padEndResult);
    }


    private String getString() {
        return "";
    }
}

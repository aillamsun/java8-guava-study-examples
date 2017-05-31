package com.sung.guava.string;

import com.google.common.base.Splitter;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

/**
 * Created by sungang on 2017/5/31.
 */
public class SplitterTest {


    /**
     * String to List
     */
    @Test
    public void whenCreateListFromString_thenCreated() {
        String input = "apple - banana - orange";
        List<String> result = Splitter.on("-").trimResults().splitToList(input);
        System.out.println(result);
        //assertThat(result, contains("apple", "banana", "orange"));
    }


    /**
     * String to Map
     */
    @Test
    public void whenCreateMapFromString_thenCreated() {
        String input = "John=first,Adam=second";
        Map<String, String> result = Splitter.on(",")
                .withKeyValueSeparator("=")
                .split(input);
        assertEquals("first", result.get("John"));
        assertEquals("second", result.get("Adam"));
    }

    /**
     * 多个字符进行分割
     */
    @Test
    public void whenSplitStringOnMultipleSeparator_thenSplit() {
        String input = "apple.banana,,orange,,.";
        List<String> result = Splitter.onPattern("[.|,]")
                .omitEmptyStrings()
                .splitToList(input);
        System.out.println(result);
    }


    /**
     * 每隔多少字符进行分割
     */
    @Test
    public void whenSplitStringOnSpecificLength_thenSplit() {
        String input = "Hello world";
        List<String> result = Splitter.fixedLength(3).splitToList(input);
        System.out.println(result);
    }


    /**
     * 限制分割多少字后停止
     */
    @Test
    public void whenLimitSplitting_thenLimited() {
        String input = "a,b,c,d,e";
        List<String> result = Splitter.on(",")
                .limit(4)
                .splitToList(input);

        assertEquals(4, result.size());
        System.out.println(result);
    }
}

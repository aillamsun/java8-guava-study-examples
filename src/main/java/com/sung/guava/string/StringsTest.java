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


    private String getString() {
        return "";
    }
}

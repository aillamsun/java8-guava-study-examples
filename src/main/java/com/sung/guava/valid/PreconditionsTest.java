package com.sung.guava.valid;

import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * Created by sungang on 2017/5/31.
 */
public class PreconditionsTest {


    @Test
    public void testCheck() {
        doSomething("Jim", 19, "hello world, hello java");
    }


    public void doSomething(String name, int age, String desc) {
        Preconditions.checkNotNull(name, "name may not be null");
        Preconditions.checkArgument(age >= 18 && age < 99, "age must in range (18,99)");
        Preconditions.checkArgument(desc != null && desc.length() < 10, "desc too long, max length is ", 10);

        //do things
    }
}

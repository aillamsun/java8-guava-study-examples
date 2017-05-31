package com.sung.guava.optional;

import com.google.common.base.Optional;
import com.sung.domian.Student;
import org.junit.Test;

/**
 * Created by sungang on 2017/5/31.
 */
public class OptionalTest {

    /**
     * 获得一个Optional对象，其内部包含了一个非null的T数据类型实例，若T=null，则立刻报错
     */
    @Test
    public void ofTest() {
        Optional<Student> possibleNull = Optional.of(null);
        possibleNull.get();
    }


    @Test
    public void ofTest2() {
        Optional<Integer> possibleNull = Optional.of(6);
        if (possibleNull.isPresent()) {
            System.out.println("possible isPresent:" + possibleNull.isPresent());
            System.out.println("possible value:" + possibleNull.get());
        }
    }

    /**
     * ：获得一个Optional对象，其内部包含了空值
     */
    @Test
    public void absentTest() {
        Optional<Student> possibleNull = Optional.absent();
        Student jim = possibleNull.get();
    }


    @Test
    public void testOptional() throws Exception {
        Optional<Integer> possible = Optional.of(6);
        Optional<Integer> absentOpt = Optional.absent();
        Optional<Integer> NullableOpt = Optional.fromNullable(null);
        Optional<Integer> NoNullableOpt = Optional.fromNullable(10);
        if (possible.isPresent()) {
            System.out.println("possible isPresent:" + possible.isPresent());
            System.out.println("possible value:" + possible.get());
        }
        if (absentOpt.isPresent()) {
            System.out.println("absentOpt isPresent:" + absentOpt.isPresent());
            ;
        }
        if (NullableOpt.isPresent()) {
            System.out.println("fromNullableOpt isPresent:" + NullableOpt.isPresent());
            ;
        }
        if (NoNullableOpt.isPresent()) {
            System.out.println("NoNullableOpt isPresent:" + NoNullableOpt.isPresent());
            ;
        }
    }
}

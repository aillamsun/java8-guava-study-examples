package com.sung.guava.collections;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.sung.domian.Person;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/**
 * Created by sungang on 2017/5/26.
 */
public class CollectionTest {


    private List<Person> peoples = ImmutableList.of(
            new Person("zhangsan", 21),
            new Person("wangwu", 33),
            new Person("maliu", 45),
            new Person("xiaohua", 8),
            new Person("lisi", 12));//初始化数据

    /**
     * filter
     * 返回的集合的迭代器不支持remove，UnsupportedOperationException
     */
    @Test
    public void filterTest() {

        List<String> list = Lists.newArrayList(null, "abcdef", null, "leveluplunch", "com", null);
        Collection<String> c = Collections2.filter(list, new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                if (input != null && input.length() > 5)
                    return true;
                return false;
            }
        });
        System.out.println(list);
        System.out.println(c);
        c.remove("abcdef");
        System.out.println(list);
        System.out.println(c);
    }

    /**
     * .筛选出集合中满足某些属性的对象
     */
    @Test
    public void filterTest2() {
        Collection<Person> peoplesNew = Collections2.filter(peoples, new Predicate<Person>() {
            @Override
            public boolean apply(Person person) {
                return person.getAge() > 10 && person.getAge() < 35;
            }
        });
        System.out.println(peoplesNew);
    }


    /**
     * transform 转换元素
     * 对每个元素 apply 一个 function
     * 返回的是一个视图，不能对结果集合add
     */
    @Test
    public void transformTest() {
        List<String> numbersAsStrings = Lists.newArrayList("1", "2", "3");
        Collection<Double> doubles = Collections2.transform(numbersAsStrings, new Function<String, Double>() {
            @Nullable
            @Override
            public Double apply(@Nullable String input) {
                return new Double(input) + 0.1;
            }
        });

        System.out.println(doubles);
        System.out.println(numbersAsStrings);
    }


    /**
     * 将一个集合元素的某一个或多个字段组成一个新的集合
     */
    @Test
    public void transformTest2() {
        Collection<String> pNames = Collections2.transform(peoples, new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.getName();
            }
        });
        System.out.println(pNames);
    }

    /**
     * orderedPermutations 排列组合(带顺序)
     */
    @Test
    public void orderedPermutationsTest() {
        List<Integer> vals = Lists.newArrayList(1, 2, 3);
        Collection<List<Integer>> orderPerm = Collections2.orderedPermutations(vals);
        for (List<Integer> val : orderPerm) {
            System.out.println(val);
        }
    }

    /**
     * permutations 排列组合
     */
    @Test
    public void permutations() {
        List<Integer> vals = Ints.asList(new int[]{1, 2, 3});
        Collection<List<Integer>> orderPerm = Collections2.permutations(vals);
        for (List<Integer> val : orderPerm) {
            System.out.println(val);
        }
    }
}

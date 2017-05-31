package com.sung.guava.collections;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.sung.domian.Person;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by sungang on 2017/5/26.
 */
public class IterablesTest {


    private List<Person> peoples = ImmutableList.of(
            new Person("zhangsan", 21),
            new Person("wangwu", 33),
            new Person("maliu", 45),
            new Person("xiaohua", 8),
            new Person("lisi", 12));//初始化数据


    List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");

    /**
     * 在集合中找出满足某个条件的所有元素，返回一个满足条件的新集合
     */
    @Test
    public void tryFindTest() {
        Optional<Person> optional = Iterables.tryFind(peoples, new Predicate<Person>() {
            @Override
            public boolean apply(@Nullable Person person) {
                return person.getAge() == 8;
            }
        });
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("is not found");
        }
    }

    /**
     * 过滤出含有字母a的元素
     */
    @Test
    public void filterTest() {
        Iterable<String> result = Iterables.filter(names, Predicates.containsPattern("a"));
        System.out.println(result);
    }



}

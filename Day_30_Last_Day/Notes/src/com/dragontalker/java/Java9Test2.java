package com.dragontalker.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Java9Test2 {

    //java9新特性十: Stream API的加强
    @Test
    public void test1() {
        //takeWhile(): 返回从开头开始的按指定规则尽量多的元素
        List<Integer> list = Arrays.asList(23, 43, 45, 55, 61, 54, 32, 2, 45, 89, 7);
        //list.stream().takeWhile(x -> x < 60).forEach(System.out::println);
    }
}

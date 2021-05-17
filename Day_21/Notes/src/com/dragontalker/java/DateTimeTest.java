package com.dragontalker.java;
/*
jdk 8之前的日期时间的API测试
1. System类中currentTimeMillis();
2. java.util.Date和子类java.sql.Date();
3. SimpleDateFormat
4. Calender
 */

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {
    /*
    SimpleDateFormat的使用: SimpleDateFormat对日期Date类的格式化和解析

    1. 两个操作:
        1.1 格式化: 日期 ---> 字符串
        1.2 解析: 格式化的逆过程, 字符串 ---> 日期

    2. SimpleDateFormat的实例化
     */

    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat: 使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化: 日期 ---> 字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        //解析: 格式化的逆过程, 字符串 ---> 日期
        String str = "2021-05-17, 11:33 a.m.";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //************用指定的方式进行格式化: 调用带参的构造器************
        //SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aaa");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1); //2021-05-17 11:38:26 a.m.

        //解析: 要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数实现)
        //否则, 就会抛异常
        Date date2 = sdf1.parse("2021-05-17 11:38:26 a.m.");
        System.out.println(date2);
    }

    /*
    练习一: 字符串"2020-09-08"转换为java.sql.Date
     */
    @Test
    public void testExercise() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        //System.out.println(birth);

        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }
}

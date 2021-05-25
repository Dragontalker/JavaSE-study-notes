package com.dragontalker.java2;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *      - 和方法引用类似
 *      - 函数式接口的抽象方法和形参列表和构造器的形参列表一致
 *      - 抽象方法的返回值类型即为构造器所属的类的类型
 *
 * 二、数组引用
 */

public class ConstructorRefTest {

    //构造器引用
    //Supplier中的T get()
    //Employee的空参构造器: Employee()
    @Test
    public void test1() {
        Supplier<Employee> sup1 = () -> new Employee();
        System.out.println(sup1.get());

        System.out.println("************");

        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
    }

    //Function中的R apply(T t)
    @Test
    public void test2() {
        Function<Integer, Employee> func1 = id -> new Employee(id);
        Employee employee1 = func1.apply(1001);
        System.out.println(employee1);

        System.out.println("************");

        Function<Integer, Employee> func2 = Employee::new;
        Employee employee2 = func1.apply(1001);
        System.out.println(employee2);
    }

    //BiFunction中的R apply(T t, U u)
    @Test
    public void test3() {
        BiFunction<Integer, String, Employee> func1 = (id, name) -> new Employee(id, name);
        Employee employee1 = func1.apply(1001, "Tom");
        System.out.println(employee1);

        System.out.println("************");

        BiFunction<Integer, String, Employee> func2 = Employee::new;
        Employee employee2 = func1.apply(1001, "Tom");
        System.out.println(employee2);
    }

    //数组引用
    //Function中的R apply(T t)
    @Test
    public void test4() {
        Function<Integer, String[]> func1 = length -> new String[length];
        System.out.println(Arrays.toString(func1.apply(5)));

        System.out.println("************");

        Function<Integer, String[]> func2 = String[]::new;
        System.out.println(Arrays.toString(func2.apply(5)));
    }
}

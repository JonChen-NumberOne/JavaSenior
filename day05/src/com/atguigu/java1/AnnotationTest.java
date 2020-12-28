package com.atguigu.java1;

/**
 * @author Jon Chen
 * @create 2020-11-30 19:58
 */
public class AnnotationTest {
    public static void main(String[] args) {

    }
}

@MyAnnotation
class Person {
    private String name;
    private int age;

    public Person() {
    }

    @MyAnnotation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    public void walk() {
        System.out.println("人走路");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}
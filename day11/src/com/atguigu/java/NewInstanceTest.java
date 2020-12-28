package com.atguigu.java;

import org.junit.Test;

import java.util.Random;

/**
 * @author Jon Chen
 * @create 2020-12-09 20:15
 */
public class NewInstanceTest {
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;

        Person obj = clazz.newInstance();
        System.out.println(obj);
    }
    //体会反射的动态性
    @Test
    public void test2(){
        int num = new Random().nextInt(3);//0.1.2
        String classPath = "";
        switch(num){
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "com.atguigu.java.Person";
                break;
        }
        try {
            Object obj = getInstance(classPath);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
  /*
    创建一个指定类的对象。
    classPath:指定类的全类名
     */
  public Object getInstance(String classPath) throws Exception {
      Class clazz = Class.forName(classPath);
      return clazz.newInstance();
  }
}

package com.atguigu.java1;

import java.io.Serializable;

/**
 * @author Jon Chen
 * @create 2020-12-11 9:42
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;
    private void breath(){
        System.out.println("生物呼吸");
    }
    public void eat(){
        System.out.println("生物吃东西");
    }
}

package com.atguigu.java2;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author Jon Chen
 * @create 2020-11-30 20:21
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(Object e):将元素e添加到集合coll中
        coll.add("aa");
        coll.add("bb");
        coll.add(123);
        coll.add(new Date());

        //size():获取添加的元素的个数
        System.out.println(coll.size());

        //addAll(Collection coll1):将coll1集合中的元素添加到当前的集合中
        Collection coll1 = new ArrayList();
        coll1.add("cc");
        coll1.add(234);
        coll.addAll(coll1);

        System.out.println(coll.size());
        System.out.println(coll);

        //clear():清空集合元素
        coll.clear();

        //isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());
    }

}

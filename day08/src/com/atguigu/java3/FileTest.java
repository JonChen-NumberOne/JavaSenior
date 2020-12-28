package com.atguigu.java3;

import org.junit.Test;

import java.io.File;
import java.util.Date;

/**
 * @author Jon Chen
 * @create 2020-12-03 23:10
 */
public class FileTest {

    @Test
    public void test1(){
        File file1 = new File("hello.txt");
        File file2 =  new File("F:\\workspace\\workspace-idea\\JavaSenior\\day08\\he.txt");

        System.out.println(file1);
        System.out.println(file2);

//构造器2：
        File file3 = new File("F:\\workspace\\workspace-idea","JavaSenior");
        System.out.println(file3);

        //构造器3：
        File file4 = new File(file3,"hi.txt");
        System.out.println(file4);
    }
    @Test
    public void test2(){
        File file1 = new File("hello.txt");
        File file2 = new File("d:\\io\\hi.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }
}

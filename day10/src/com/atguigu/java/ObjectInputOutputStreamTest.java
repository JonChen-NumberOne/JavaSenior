package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author Jon Chen
 * @create 2020-12-05 19:56
 */
public class ObjectInputOutputStreamTest {

    @Test
    public void testObjectOutputStream() {
        ObjectOutputStream oos = null;
        try {
            //1
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //2
            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();

            oos.writeObject(new Person("王铭", 23));
            oos.flush();

            oos.writeObject(new Person("张学良", 23, 1001, new Account(5000)));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null)
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String str =(String)obj;

            Person p = (Person)ois.readObject();
            Person p1 = (Person)ois.readObject();

            System.out.println(str);
            System.out.println(p);
            System.out.println(p1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois!=null)
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}

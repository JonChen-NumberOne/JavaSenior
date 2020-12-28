package com.atguigu.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Jon Chen
 * @create 2020-12-02 20:11
 */
public class EmployeeTest {
    //自然排序
    @Test
    public void test1() {
        TreeSet<Employee> set = new TreeSet<>();
        Employee e1 = new Employee("liangchaowei", 54, new MyDate(1964, 10, 5));
        Employee e2 = new Employee("goufucheng", 60, new MyDate(1946, 10, 6));
        Employee e3 = new Employee("liming", 34, new MyDate(1999, 4, 4));
        Employee e4 = new Employee("zhangxueyou", 45, new MyDate(1978, 3, 5));
        Employee e5 = new Employee("liudehua", 57, new MyDate(1978, 3, 7));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //定制排序
    @Test
    public void test2() {
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate b1 = o1.getBirthday();
                MyDate b2 = o2.getBirthday();
                return b1.compareTo(b2);
            }
        };
//        Comparator<Employee> com = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Employee && o2 instanceof Employee){
//                    Employee e1 = (Employee)o1;
//                    Employee e2 = (Employee)o2;
//
//                    MyDate b1 = e1.getBirthday();
//                    MyDate b2 = e2.getBirthday();
//
//                    return b1.compareTo(b2);
//                }
//                throw new RuntimeException("输入的数据不一致");
//            }
//        };

        TreeSet<Employee> set = new TreeSet<Employee>(com);
        Employee e1 = new Employee("liangchaowei", 54, new MyDate(1964, 10, 5));
        Employee e2 = new Employee("goufucheng", 60, new MyDate(1946, 10, 6));
        Employee e3 = new Employee("liming", 34, new MyDate(1999, 4, 4));
        Employee e4 = new Employee("zhangxueyou", 45, new MyDate(1978, 3, 5));
        Employee e5 = new Employee("liudehua", 57, new MyDate(1978, 3, 7));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}

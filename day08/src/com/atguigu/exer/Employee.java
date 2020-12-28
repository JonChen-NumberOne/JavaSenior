package com.atguigu.exer;

/**
 * @author Jon Chen
 * @create 2020-12-02 20:11
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birthday;


    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    /**
     * 按 name 排序
     * @param o
     * @return
     */
//    @Override
//    public int compareTo(Object o) {
//        if(o instanceof Employee){
//            Employee e = (Employee)o;
//            return this.name.compareTo(e.name);
//        }else{
//            throw new RuntimeException("输入的数据不一致");
//        }
//    }

    @Override
    public int compareTo(Employee o) {
        Employee e = (Employee)o;
        return this.name.compareTo(e.name);
    }
}



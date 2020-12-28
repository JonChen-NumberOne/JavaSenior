package com.atguigu.exer1;

/**
 * @author Jon Chen
 * @create 2020-12-02 20:23
 */
public class MyDate implements Comparable {

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {

    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    //年月日从大到小
    @Override
    public int compareTo(Object o) {
        if (o instanceof MyDate) {
            MyDate date = (MyDate) o;
            int year = this.year - date.year;
            if (year != 0) {
                return year;
            }
            int month = this.month - date.month;
            if (month != 0) {
                return month;
            }
            return this.day - date.day;
        }
        throw new RuntimeException("输入的数据不一致");
    }
}

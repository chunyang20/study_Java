package cn.day0807.yc.code1._07date;

import java.util.Date;

/**
 * @author 杨春
 * @DATE 2022/8/7 16:25
 */
/*

    java.util.Date
    java.sql.Date

    Date:java里面用来表示时间的一个类
    Date(long date) 分配一个 Date对象，并将其初始化为表示自称为“时代”的标准基准时间以后的指定毫秒数，即1970年1月1日00:00:00 GMT。

 */
public class DateTest {
    public static void main(String[] args) {
        Date date=new Date();   //就是代表当前的系统时间
        System.out.println(date);   //不符合国内时间习惯

        long time=System.currentTimeMillis()+1000*60*60*24*7;     //计算未来时间
        Date d2=new Date(time);
        System.out.println(d2);
    }

}

package cn.day0807.yc.code1._07date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杨春
 * @DATE 2022/8/7 16:40
 */
/*
    时间格式化的类：
        DateFormat---抽象类
            SimpleDateFormat(String pattern)    使用指定的格式去格式化时间
            pattern：指定的格式 -  yyyy-MM-dd HH:mm:ss
        String format(Date date)    将日期格式化成日期/时间字符串

 */
public class DateFormatTest {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        //格式化指定的时间
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(simpleDateFormat.format(date));

    }
}

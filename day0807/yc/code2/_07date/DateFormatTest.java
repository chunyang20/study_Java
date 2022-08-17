package cn.day0807.yc.code2._07date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杨春
 * @DATE 2022/8/8 12:28
 */
public class DateFormatTest {

    public static void main(String[] args) {
        //DateFormat    设置时间的格式
        Date date=new Date();
        System.out.println(date);
        /*
        时间格式化：
        	DateFormat---抽象类
        		SimpleDateFormat
                SimpleDateFormat(String pattern)  使用指定的格式去格式化时间。
        		pattern：指定的格式 -  yyyy-MM-dd HH:mm:ss
                String format(Date date) 将日期格式化成日期/时间字符串。
         */
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));


    }
}

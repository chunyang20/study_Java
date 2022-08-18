package cn.day0809.yc._01exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杨春
 * @DATE 2022/8/9 10:38
 */
public class FormatTest {
    public static void main(String[] args) {

        System.out.println(FormatTest.date2String(new Date()));
        System.out.println(FormatTest.str2Date("2022-08-09 19:03:02"));
    }
    public static String date2String(Date d){
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sim.format(d);
    }

    //把字符串时间格式的字符串转换为Date
    public static Date str2Date(String time){
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=null;
        try {
            //parse解析传入的时间
            d=sim.parse(time);
        }catch (ParseException e){
            e.printStackTrace();
        }

        return d;
    }
}

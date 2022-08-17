package cn.day0807.yc.code2._07date;

import java.util.Date;

/**
 * @author 杨春
 * @DATE 2022/8/8 12:24
 */
public class DateTest {
    public static void main(String[] args) {
        //当前系统的时间
        Date date=new Date();
        System.out.println(date);
        //但是不符合国人的时间习惯
        long time=System.currentTimeMillis()+1000*60*60*24*7;//从现在开始7天后的时间
        Date date2=new Date(time);
        System.out.println(date2);
    }
}

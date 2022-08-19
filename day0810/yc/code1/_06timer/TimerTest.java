package cn.day0810.yc.code1._06timer;

import java.util.Date;
import java.util.Timer;

/**
 * @author 杨春
 * @DATE 2022/8/10 15:10
 */
/*
    定义任务【定时器】
    1.什么时间
    2.做什么任务

Timer
  	void schedule(TimerTask task, Date time)  在指定的时间安排指定的任务执行。
 	void schedule(TimerTask task, Date firstTime, long period)  从指定 的时间开始 ，对指定的任务执行重复的 固定延迟执行 。
    void schedule(TimerTask task, long delay)  在指定的延迟之后安排指定的任务执行。
 	void schedule(TimerTask task, long delay, long period)  在指定 的延迟之后开始 ，重新执行 固定延迟执行的指定任务。
 */
public class TimerTest {
    public static void main(String[] args) {
        //创建定时任务的对象
        Timer t=new Timer();
        //职工任务执行的时间
        Date date=new Date(System.currentTimeMillis()+1000*5);
        //指定具体的任务对象
        Boom boom=new Boom();
        //安排定时任务
        t.schedule(boom,date,2000);     //boom指定的任务，date任务执行的时间，period重复运行的时间

    }

}

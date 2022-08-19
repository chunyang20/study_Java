package cn.day0810.yc.code1._06timer;

import java.util.TimerTask;

/**
 * @author 杨春
 * @DATE 2022/8/10 17:44
 */
/*
    定时器 【了解】
 */
public class Boom extends TimerTask {

    @Override
    public void run() {
        //指定定时任务，要做的具体的任务
        System.out.println("boom....瞎卡拉卡");
    }
}

package cn.day0810.yc.code2._02ticket._ticketEx;

/**
 * @author 杨春
 * @DATE 2022/8/10 18:24
 */
/*
    创建线程的方法一：继承Thread
 */
public class Ticket extends Thread{
    static int num=50;
    private String name;
    public Ticket(String name){
        this.name=name;
    }

//重写Thread的run方法

    @Override
    public void run() {
        while (num>0){
            System.out.println("您的票号为："+num);
            //线程休眠1毫秒
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
        }
    }
}

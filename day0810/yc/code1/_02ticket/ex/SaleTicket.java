package cn.day0810.yc.code1._02ticket.ex;

/**
 * @author 杨春
 * @DATE 2022/8/10 11:16
 */
/*
  创建线程的方式一：继承Thread
    缺点：
    1、继承有局限，Java中类只能够单继承
 */

public class SaleTicket extends Thread{
    //共享的票池
    static int num=50;
    //定义个形参区别线程
    private String name;


    @Override
    public void run() {
        while (num>0){
            System.out.println(name+"您的票号是：" + num+"剩余票数:"+num);
            try {
                /*
                    static void sleep(long millis)方法，在指定的毫秒数内让当前正在执行的线程休眠
                */
                Thread.sleep(1);            //让线程休眠1毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
        }
    }
    public SaleTicket(String name){
        this.name=name;
    }

}

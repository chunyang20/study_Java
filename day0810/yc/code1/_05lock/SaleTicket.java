package cn.day0810.yc.code1._05lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 杨春
 * @DATE 2022/8/10 11:24
 */
/*
    解决线程安全问题：
    方式一：同步代码块
    当有一个线程去执行里面的内容的时候，其他线程处于等待状态，只有当上一
        个线程执行结束以后，其他等待线程才会依次进入
        synchronized(同步监听对象){
            可能引发线程安全问题的代码
        }
        同步监听对象：类名.class

    方式二：同步方法

    方式三：锁机制：lock
            有一点类似于同步代码块：
            1.创建一把锁
            2.确定有线程安全问题代码
            3.在执行有线程安全问题代码的时候【上锁】
            4.执行结束以后一定要释放锁【开锁】
    Lock
  	    --ReentrantLock
 		    void lock()  获得锁。
 		    void unlock() 释放锁。

 */
public class SaleTicket extends Thread{
    //共享的票池
    static int num=50;
    //所有的对象共享一把锁
    static ReentrantLock r1=new ReentrantLock();
    private String name;
    @Override
    public void run() {
        //循环判断，有票就卖
        while (num>0){
            try {
                //上锁
                r1.lock();
                //判断卖一张票的操作
                if (num > 0) {              //防止票已经卖完，还有多余的线程在排队
                    System.out.println(name + "您的票号是：" + num + "剩余票数:" + num);
                    num--;
                }
                Thread.sleep(1);

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //无论报不报异常都要释放锁
                r1.unlock();
            }
        }

    }
    public SaleTicket(String name){
        this.name=name;
    }
    public SaleTicket(){
    }
}

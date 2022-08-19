package cn.day0810.yc.code1._02ticket.impl;

/**
 * @author 杨春
 * @DATE 2022/8/10 10:42
 */
/*
创建线程的方式二：实现Runnable接口
    实现的方式，我们的类在业务上可以继承它本应该有的类，同时可以实现接口变成一个线程类
 */

//创建卖票的类实现Runnable接口
public class SaleTicket implements Runnable{
    //共享的票池
    static int num=50;

    //覆写方法
    @Override
    public void run() {
        while (num>0){
            /*
            获取线程的名字，使用Thread对象.getName()方法
            Thread
                static Thread currentThread()   返回当前正在执行的线程对象的引用
             */
            Thread thread=Thread.currentThread();
            System.out.println(thread.getName()+"您的票号为："+num);
            num--;

        }
    }
}

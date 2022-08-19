package cn.day0810.yc.code1._02ticket.impl;

/**
 * @author 杨春
 * @DATE 2022/8/10 11:03
 */
public class TicketTest {
    public static void main(String[] args) {
        //创建卖票类的对象
        SaleTicket s1=new SaleTicket();
        //创建线程，把对象,线程名字赋给线程,再调用start方法
        /*
            给线程设置名字
		 	Thread(Runnable target, String name)  分配一个新的 Thread对象。
        */
        new Thread(s1,"携程").start();
        new Thread(s1,"飞猪").start();
        new Thread(s1,"铁路").start();

        //同一个对象被三个线程来对象共享，线程依旧不安全，
    }
}

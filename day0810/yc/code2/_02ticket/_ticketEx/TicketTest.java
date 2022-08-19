package cn.day0810.yc.code2._02ticket._ticketEx;

/**
 * @author 杨春
 * @DATE 2022/8/10 18:28
 */

public class TicketTest {
    public static void main(String[] args) {
        //创建继承线程类的对象,同一个线程的不同对象
        Ticket t1=new Ticket("携程");
        Ticket t2=new Ticket("中铁");
        Ticket t3=new Ticket("飞猪");

        t1.start();
        t2.start();
        t3.start();


    }
}

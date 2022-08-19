package cn.day0810.yc.code2._02ticket._ticketImpl;

/**
 * @author 杨春
 * @DATE 2022/8/10 18:42
 */
public class TicketTest {
    public static void main(String[] args) {


        Ticket t4=new Ticket("飞猪");
        /*
        Ticket t5=new Ticket("携程");
        Ticket t6=new Ticket("中铁");
        Ticket t7=new Ticket("飞猪");
        new Thread(t5).start();
        new Thread(t6).start();
        new Thread(t7).start();
        */

        new Thread(t4,"飞猪").start();
        new Thread(t4,"中铁").start();
        new Thread(t4,"携程").start();
    }
}

package cn.day0810.yc.code2._03ticketcode;


/**
 * @author 杨春
 * @DATE 2022/8/10 19:00
 */
public class TicketTest {
    public static void main(String[] args) {
        //创建类的对象
        SaleTicket t1=new SaleTicket();
        new Thread(t1,"飞猪").start();
        new Thread(t1,"携程").start();
        new Thread(t1,"中铁").start();


    }
}

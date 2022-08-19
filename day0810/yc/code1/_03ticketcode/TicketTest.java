package cn.day0810.yc.code1._03ticketcode;



/**
 * @author 杨春
 * @DATE 2022/8/10 11:32
 */
public class TicketTest {
    public static void main(String[] args) {

        //创建类的对象
        SaleTicket t1=new SaleTicket("携程");
        SaleTicket t2=new SaleTicket("飞猪");
        SaleTicket t3=new SaleTicket("铁路");
            t1.start();
            t2.start();
            t3.start();

    }
}

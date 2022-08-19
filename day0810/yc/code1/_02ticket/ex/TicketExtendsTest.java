package cn.day0810.yc.code1._02ticket.ex;
/**
 * @author 杨春
 * @DATE 2022/8/10 11:21
 */
public class TicketExtendsTest {
    public static void main(String[] args) {
        //创建集成类的对象
        SaleTicket t1=new SaleTicket("携程");
        SaleTicket t2=new SaleTicket("飞猪");
        SaleTicket t3=new SaleTicket("铁路");
        //调用start方法启动线程
        t1.start();
        t2.start();
        t3.start();

        /*
        使用这种方法创建的线程，每个线程主体都是独立的，各自
        使用自己的实例变量初始值都是50，线程不安全
         */
    }



}

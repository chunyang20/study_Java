package cn.day0810.yc.code1._04method;

/**
 * @author 杨春
 * @DATE 2022/8/10 11:03
 */
public class TicketTest {
    public static void main(String[] args) {
        //创建卖票类的对象
        SaleTicket s1=new SaleTicket();
        //创建线程，把对象,线程名字赋给线程,在调用start方法
        new Thread(s1,"携程").start();
        new Thread(s1,"飞猪").start();
        new Thread(s1,"铁路").start();
    }
}

package cn.day0810.yc.code1._03ticketcode;

/**
 * @author 杨春
 * @DATE 2022/8/10 11:24
 */
/*
    解决线程安全问题：
    方式一：同步代码块
        synchronized(同步监听对象){
            可能引发线程安全问题的代码
        }
        同步监听对象：类名.class

        同步代码块   当有一个线程去执行里面的内容的时候，其他线程处于等待状态，只有当上一
        个线程执行结束以后，其他等待线程才会依次进入

 */
public class SaleTicket extends Thread{
    //static修饰共享一个票池
    static int num=50;
    private String name;
    @Override
    public void run() {

        while (num>0){
            /*
            可能引发线程安全问题的代码
            线程只能够一个一个的进来，执行完一个，下一个才能进来
             */
            synchronized (SaleTicket.class){        //同步代码块
                //防止票已经卖完还有多余的线程在排队
                if (num>0) {
                    System.out.println(name + "您的票号是：" + num + "剩余票数:" + num);
                    num--;
                }
            }
            try {
                //线程睡眠
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
    public SaleTicket(String name){
        this.name=name;
    }
    public SaleTicket(){

    }
}

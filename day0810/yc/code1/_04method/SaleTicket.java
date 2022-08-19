package cn.day0810.yc.code1._04method;

/**
 * @author 杨春
 * @DATE 2022/8/10 10:42
 */
/*
    线程同步方式二：
        同步方法
 */
public class SaleTicket implements Runnable{
    //共享的票池
    static int num=50;

    //覆写方法
    @Override
    public void run() {
        while (num>0){
            //调用卖票的方法
            sale();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //在被同步的方法上面加关键字synchronized
    public synchronized void sale(){
        if(num>0) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "您的票号为：" + num);
            num--;
        }
    }
}

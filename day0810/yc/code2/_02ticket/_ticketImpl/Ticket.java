package cn.day0810.yc.code2._02ticket._ticketImpl;

/**
 * @author 杨春
 * @DATE 2022/8/10 18:35
 */
/*
        创建线程的方法二  实现Runnable接口
 */
public class Ticket implements Runnable{
    static int num=50;
    String name;
    //实现接口的抽象方法
    @Override
    public void run() {
        while (num>0){
            Thread thread=Thread.currentThread();
            System.out.println(thread.getName()+"您的票号是:"+num);
            num--;

        }
    }
    public Ticket(String name){
        this.name=name;
    }
    public Ticket(){

    }
}

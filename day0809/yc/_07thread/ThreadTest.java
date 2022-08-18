package cn.day0809.yc._07thread;




/**
 * @author 杨春
 * @DATE 2022/8/9 16:06
 */
/*
//创建线程方式二：
        1.自定义一个类，并实现Runnable接口
        2.覆写run方法
        3.创建Thread对象，把实现类对象作为参数传入
        4.使用Thread对象，调用start方法

   Thread()  分配一个新的 Thread对象。
   Thread(Runnable target)  分配一个新的 Thread对象。
 	    Runnable--接口
 		    QQMusic
 		    DNFGame

 问题：
        1.下面的程序有几个线程？
            3个
        2.为什么线程的执行逻辑写在run里面，启动线程的时候调用的是start
            start和run的区别？
            start是新开启一个线程，由线程的底层去调用run方法执行
            run：仅仅只是一个方法，如果调用run，单纯的是对象调用方法
        3.线程的实现有两种，一种是继承Thread  实现Runnable接口，哪种好？
            实现Runnable， java里面单继承多实现

 */
public class ThreadTest {
    public static void main(String[] args) {
        QQMusic music=new QQMusic();
        Thread t1=new Thread(music);
        t1.start();

        DNF game=new DNF();
        new Thread(game).start();

    }
}

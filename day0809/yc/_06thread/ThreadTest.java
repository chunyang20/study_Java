package cn.day0809.yc._06thread;

/**
 * @author 杨春
 * @DATE 2022/8/9 16:06
 */
/*
    创建并启动线程的方式一：
        1.写一个类继承Thread
        2.覆写父类的run方法【定义我们自己线程的功能】
        3.创建子类对象，并调用start方法


 */
public class ThreadTest {
    public static void main(String[] args) {
        QQMusic qqMusic=new QQMusic();
        qqMusic.start();
        LOL game=new LOL();
        game.start();
    }
}

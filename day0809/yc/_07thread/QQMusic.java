package cn.day0809.yc._07thread;

/**
 * @author 杨春
 * @DATE 2022/8/9 16:13
 */
public class QQMusic extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("鸡你太美");
        }
    }
}

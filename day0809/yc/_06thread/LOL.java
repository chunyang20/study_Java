package cn.day0809.yc._06thread;

/**
 * @author 杨春
 * @DATE 2022/8/9 16:13
 */
public class LOL extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("我的大刀早已饥渴难耐了");
        }
    }
}

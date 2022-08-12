package day0721.yc;
/*
 *  4. 请根据需求完成功能：现有vip5个等级，分别1、2、3、4、5 ，不同等级具有不同的权限，
 *  分别通过打印语句表示，打印如下：
 *  	vip1 : low
 *  	vip2 : 一点low
 *  	vip3 : 还行
 *  	vip4 : 有点牛皮
 *  	vip5 : 非常牛皮，有小弟和小蜜
 */

import java.util.Random;


public class _switch02 {
    public static void main(String[] args) {
        Random r =new Random();
        int randNum=r.nextInt(5)+1;
        switch (randNum){
            case 1:
                System.out.println("vip1 : low");
                break;
            case 2:
                System.out.println("vip2 : 一点low");
                break;
            case 3:
                System.out.println("vip3 : 还行");
                break;
            case 4:
                System.out.println("vip4 : 有点牛皮");
                break;
            case 5:
                System.out.println("vip5 : 非常牛皮，有小弟和小蜜");
                break;
        }

    }
}

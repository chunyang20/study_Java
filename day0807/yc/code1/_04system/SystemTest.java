package cn.day0807.yc.code1._04system;

import java.util.Arrays;

/**
 * @author 杨春
 * @DATE 2022/8/7 14:10
 */
/*
    System:
    字段:
        in:输入
        out:输出
        err:错误输出，红色字体输出

    方法：
        Static arraycopy();
        static long currentTimeMillis()         返回当前时间（以毫秒为单位）      订单号
        static void exit(int status)            终止当前运行的java虚拟机
        static void gc()                        运行垃圾回收器
        static Properties getProperties()       确定当前的系统属性。


 */
public class SystemTest {
    public static void main(String[] args) {
        System.out.println("----");
        System.err.println("-----");

        int[]arr={1,2,3,4,5,6,7,9};
        int[]newArr=new int[12];

        System.arraycopy(arr,1,newArr,0,5);
        System.out.println(Arrays.toString(newArr));

        long timeMills=System.currentTimeMillis();
        //1659853128727    --时间戳        从1970-1-1  0：0：0：000开始
        System.out.println(timeMills);

        System.out.println(System.getProperties());
    }
}

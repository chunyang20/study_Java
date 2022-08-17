package cn.day0807.yc.code1._03Math;

/**
 * @aythor 杨春
 * @DATE 2022/8/7 11:08
 */
public class MathTest {
    public static void main(String[] args) {
        int i=Math.abs(-128);       //abs返回绝对值
        System.out.println(Math.multiplyExact(3, 4));   //返回两个数的乘积
        System.out.println(i);
        System.out.println(Math.max(69, 66));       //返回最大值
        System.out.println(Math.random());      //返回随机数double类型

    }
}

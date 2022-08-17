package cn.day0807.yc.code1._03Math;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author 杨春
 * @DATE 2022/8/7 11:18
 *
 *
 *
 */
/*
         BigInteger：用来表示比long更大的数
         BigInteger(String val)      将BigInteger的十进制字符串表示形式转换为BigInteger
         注意：是用BigInteger对象表示一个数，不能使用传统的+ - * / 操作


         BigDecimal:用来去表示精确的小数（用的多）
            使用场景：跟钱有关的都要使用BigDecimal


 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigInteger big=new BigInteger("11111846448681158459856");
        System.out.println(Long.MAX_VALUE);
        System.out.println(big);

        //System.out.println(big+1);
        /*
            BigInteger add(BigInteger val)  返回值为 (this + val) 。
         */
        BigInteger bin=new BigInteger("1");
        System.out.println(big.add(bin));
        System.out.println("-----------");
        /*
            double和float都不能精确的表示一个小数
         */
        System.out.println(new BigDecimal("0.9"));
        //创建一些精确的小数
        BigDecimal d1=new BigDecimal("32.9");
        System.out.println(new BigDecimal("32.6"));
        System.out.println(new BigDecimal(32.75));
        System.out.println(new BigDecimal(39.4));   //0.5  0.25  0.125能用二进制精确表示就不用加引号
        BigDecimal d2=new BigDecimal("15");
        System.out.println(d1.add(d2));             //  +
        System.out.println(d1.subtract(d2));        //  -
        System.out.println(d1.multiply(d2));        //  *
        //System.out.println(d1.divide(d2));        //  /除法报错，循环不知道精确到哪位
        //除法    BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)  返回一个 BigDecimal ，其值为 (this / divisor) ，其比例为指定。
        System.out.println(d1.divide(d2, 2, BigDecimal.ROUND_HALF_UP));     //2.19333333
        //保留小数的问题
        BigDecimal d3=new BigDecimal("32.85999999");
        BigDecimal d4=new BigDecimal("32.850000001");
        BigDecimal d5=new BigDecimal("32.85500001");
        /*
         * BigDecimal setScale(int newScale, int roundingMode)  返回一个 BigDecimal ，其规模是指定值，其缩放值通过将此 BigDecimal的非标度值乘以10的适当功率来确定，以维持其总体值。
         * static int ROUND_DOWN ：向下舍入 。
         * static int ROUND_UP：  向上舍入。
         * static int ROUND_HALF_UP：  四舍五入。 包含临界值5
         */
        //ROUND_DOWN  不管是多少都舍掉
        System.out.println(d3.setScale(2, BigDecimal.ROUND_DOWN));
        //ROUND_UP    向上舍入
        System.out.println(d4.setScale(2, BigDecimal.ROUND_UP));
        //四舍五入。包含临界值5
        System.out.println(d5.setScale(2, BigDecimal.ROUND_HALF_UP));


    }
}

package cn.day0807.yc.code2._03math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author 杨春
 * @DATE 2022/8/8 9:46
 */
public class MathTest {
    public static void main(String[] args) {
        /*
         * static int abs(int a)  返回值为 int绝对值。
         * 		static修饰--使用类名调用
         */
        System.out.println(Math.abs(-5));
        /*
         * static int max(int a, int b)  返回两个 int值中的较大值。
         */
        System.out.println(Math.max(3.5, 4.6));
        /*
         * static double random()  返回值为 double值为正号，大于等于 0.0 ，小于 1.0 。
         */
        System.out.println(Math.random());
        System.out.println("---------测试BigInteger-------------");
        /*
        BigInteger:用来去表示比Long 更大的数
        BigInteger(String val)  将BigInteger的十进制字符串表示形式转换为BigInteger。
        是用BigInteger对象表示一个数，不能使用传统的 + - * /操作数字

         */
        BigInteger a1=new BigInteger("464564654654564897987987987654");
        System.out.println(Long.MAX_VALUE);
        System.out.println(a1);
        /*
            BigInteger add(BigInteger val)  返回值为 (this + val) 。
         */
        BigInteger a2=new BigInteger("1");
        System.out.println(a1.add(a2));
        System.out.println("---------测试BigDecimal---------");
        /*
            float和double都不能精确的表示一个数
            BigDecimal:用来去表示精确地小数【用的多】
            BigDecimal(String val)  将BigDecimal的字符串表示 BigDecimal转换为 BigDecimal 。
            BigDecimal:的使用场景？和钱相关的都要使用BigDecimal
        */
        double a3=5.4;
        BigDecimal a4=new BigDecimal(6.3);
        System.out.println("a3是"+a3+"\na4是"+a4);
        //1.创建一些精确的小数
        BigDecimal a5=new BigDecimal("6.3");
        BigDecimal a6=new BigDecimal("3.7");
        /*
            加法        不精确+精确=不精确      精确+精确=精确
            BigDecimal add(BigDecimal augend)  返回 BigDecimal ，其值是 (this + augend) ，其标为 max(this.scale(), augend.scale()) 。
         */
        System.out.println(a4.add(a6));
        System.out.println(a5.add(a6));
        /*
            减法
            BigDecimal subtract(BigDecimal subtrahend) 返回 BigDecimal ，其值是 (this - subtrahend)
         */
        System.out.println(a5.subtract(a6));
        /*
            乘法
            BigDecimal multiply(BigDecimal multiplicand)  返回 BigDecimal ，其值是 (this × multiplicand)
         */
        System.out.println(a5.multiply(a6));
        /*
            除法      可能不精确，需要设置保留几位小数以及保留的方式
            BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)  返回一个 BigDecimal ，其值为 (this / divisor) ，其比例为指定。
         */
        //System.out.println(a5.divide(a6));    //直接除报错，除不尽但是又要精确表示，所以要设置小数
        System.out.println(a5.divide(a6, 2, BigDecimal.ROUND_UP));  //1.702702    向上舍入1.71
        System.out.println(a5.divide(a6, 2, BigDecimal.ROUND_DOWN));  //1.702702    向下舍入1.70  1.709999也是1.70
        System.out.println(a5.divide(a6, 2, BigDecimal.ROUND_HALF_UP));  //1.702702    四舍五入    包含5  1.705654第三位是5以上就舍入1.71
        /*
            保留小数问题
         */
        BigDecimal a7=new BigDecimal("34.595");
        System.out.println(a7.setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}

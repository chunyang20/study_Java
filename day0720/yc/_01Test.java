package day0720.yc;
/*
*   变量定义的语法
*   数据类型：byte
*   类型的转换：
*           低自动转高，高转低强制转换（可能失去精度）
*
*   运算符：
*       1.数字运算  +   -   *   /   %(取模-取余数)
*       +：除了可以作为数字运算的加法，还可以拼接字符串
* */


public class _01Test {
    public static void main(String[] args) {
        String str="xx";
        int i;
        i=10;
        byte b=127;
        int i2=b;
        byte b2=(byte)i;
        System.out.println(20%3);
        System.out.println("==="+true+false);

    }
}

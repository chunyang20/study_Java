package cn.day0807.yc.code1._02Integer;
/*
    包装类：    对基本数据类型使用一个类去描述
    基本数据类型              包装类
        byte                Byte
        short               Short
        char                Character
        int                 Integer             ----
        long                Long
        float               Float
        double              Double              ----
        boolean             Boolean             ----

        基本数据类型：byte 只能去定义-128-127之间的数字
        包装类：Byte  也能去表示-128-127之间的数字，每一个数字都当成是Byte类型的对象

        包装类：
            1.包装类记录自己的最大值和最小值
            2.提供了一些处理数据的方法--->类型的转换
            3.包装类的对象，可以调用方法，基本数据类型不能调用方法
            4.默认值不同,包装类的默认值为null

 */
public class IntegerTest {
    static int n;           //主方法静态方法不能使用非静态的成员变量，所以加static
    static Integer t;
    public static void main(String[] args) {
        long l=1120;
        Double d=3.14;
        System.out.println(d);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        int i=8848;
        //创建一个Integer类型的对象8848
        Integer a=new Integer(8848);
        //把a变成一个字符串
        String str=a.toString();
        System.out.println(str);
        //默认值不同
        System.out.println(n);
        System.out.println(t);



    }
}

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
            4.默认值不同

        装箱与拆箱：
            Integer(int value)构造一个新分配的Integer对象，该对象表示指定的int值
            自动装箱：把基本数据类型的值赋值给引用数据类型的情况
            自动拆箱：把引用数据类型的值赋值给基本数据类型的情况
 */

public class IntegerTest02 {
    public static void main(String[] args) {
        String str="";
        //使用Integer表示一些数字
        Integer i1=new Integer(9527);
        Integer i2=new Integer(9526);
        Integer i3=new Integer(9525);
        Integer i4=new Integer(9523);
        //对于以上的写法--仅仅只是表示一个数字，书写上特别麻烦
        //自动装箱
        Integer i5=9527;
        Integer i6=9524;
        Integer i7=9522;
        Integer i8=9520;


        //自动拆箱：把i5这个对象里面的数字取出来赋值给i9
        int i9=i5;          //int i9=new Integer(9527);
    }
}

package cn.day0807.yc.code2._02integer;

/**
 * @author 杨春
 * @DATE 2022/8/7 22:33
 */
/*
包装类
Integer    使用一个类去描述基本数据类型
基本数据类型		包装类
byte			Byte
short			Short
int				Integer
long			Long
float			Float
double			Double
char			Character
boolean			Boolean
                默认值null

    Java底层把[-128,127]之间的数字都已经缓存好了

  	结论：Integer是引用数据类型，比较两个对象是否相等，还是应该使用equals
 */
public class TestInteger01 {
    public static void main(String[] args) {
        //jdk1.5之前这样写
        // Integer a=new Integer(520);
        //jdk1.5之后可以直接这样  装箱：把基本数据类型的值 赋值给引用数据类型的情况
        Integer a= 520;
        //包装类的对象可以直接调方法
        System.out.println(a.equals(520));
        //包装类记录最大最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        //享元模式比较两个数是否相等
        Integer y1=127;
        Integer y2=127;
        System.out.println(y1==y2);
        Integer y3=128;
        Integer y4=128;
        System.out.println(y3==y4);
        Integer y5=new Integer(127);
        Integer y6=new Integer(127);
        System.out.println(y5==y6);

        //比较是否相等还是用equals
        System.out.println(y3.equals(y4));
        System.out.println(y5.equals(y6));


    }
}

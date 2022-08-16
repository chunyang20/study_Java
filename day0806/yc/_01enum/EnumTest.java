package cn.day0806.yc._01enum;
/*
*   枚举：Enum
*       使用一种类型去表示固定的几个值
*
*
*
*
*
*
* */
public class EnumTest {

    public static void main(String[] args) {
        //数据类型  变量名=对象;

        Gender g1=Gender.MAN;
        //Gender gender=new Gender();       //有构造方法，但是不能创建对象
        //
//        Gender man=Gender.MAN;
//        man.show();

        Gender.MAN.show();      //开发真实写法，直接枚举对象.方法
        //能否打印对象的时候  打印  男、女、未知
        System.out.println(Gender.MAN);             //不打印地址值是因为原来enum里面复习了toString方法
        System.out.println(Gender.WOMEN);
        System.out.println(Gender.UNKNOWN);
    }
}

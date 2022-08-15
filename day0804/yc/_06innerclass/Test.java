package cn.day0804.yc._06innerclass;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //创建内部类的对象
        Outer.Inner1 ins=new Outer().new Inner1();
        //创建静态内部类对象
        Outer.Inner2 ins2=new Outer.Inner2();

        //看Arrays底层内部类的写法，Ctrl点击Arrays
        int[]a={1,4};
        System.out.println(Arrays.toString(a));
    }
}

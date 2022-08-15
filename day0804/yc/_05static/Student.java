package cn.day0804.yc._05static;

public class Student {

    static String name;     //类变量
    int age;                //实例变量
    String classes;
    String phone;

    public static void study(){
         int i=100;
    }
    public  Student(){

    }
    //内部类
    static class Inner{

    }
}

class A extends Student{
    //@Override                     //加方法重写报错
    public static void study(){     //这两个静态方法各是各的，不是方法的复写
        int i=100;
    }
}

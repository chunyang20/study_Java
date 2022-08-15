package cn.day0804.yc._03test;

public class Test {
    public static void main(String[] args) {
        Animal a=new Pig();
        //编译时：调用的是父类的属性和方法，方法重写了优先调用子类的
        a.sex=true;

        a.sleep();
        //a.gbc();     //不能直接调用子类特有的方法
        //调用子类特有的属性和方法需要向下强制转型
        //写法1
        Pig p1=(Pig)a;
        p1.gbc();
        //写法2
        ((Pig)a).gbc();
        ((Pig)a).name="泰国香猪";


    }


}

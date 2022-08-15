package cn.day0804.yc._02test;

public class Person extends Animal{
    String name="子类的name";
    String intro="疾风剑豪";
    public void coding(){
        System.out.println("敲代码");
    }

    @Override
    public void show() {
        System.out.println("子类的show方法");
    }
}

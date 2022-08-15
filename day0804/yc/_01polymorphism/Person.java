package cn.day0804.yc._01polymorphism;

public class Person extends Animal{
    int age=2;

    @Override
    public void eat() {
        System.out.println("吃肉");
    }

    public void coding(){
        System.out.println("敲代码");
    }
}

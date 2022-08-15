package cn.day0804.yc._01polymorphism;

public class Pig extends Animal{
    int age=3;

    @Override
    public void eat() {
        System.out.println("吃白菜");
    }

    public void gongBaiCai(){
        System.out.println("拱白菜");
    }
}

package cn.day0804.yc._03test;

public class Pig extends Animal{
    String name;
    int age;
    int length;
    //拱白菜
    public void gbc(){
        System.out.println("拱白菜");
    }

    @Override
    public void sleep() {
        System.out.println("猪是吃了就睡");
    }
}

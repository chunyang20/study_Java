package cn.day0806.yc._03oop;
/*
*   类可以同时实现多个接口
*   类可以同时继承另外一个类并实现接口，但是必须先继承后实现
*   接口与接口之间可以继承，并且支持多继承
*
*
* */
public class Tomcat implements Cat{


    @Override
    public void jump() {
        System.out.println("四川名猫--假老练");
    }
}

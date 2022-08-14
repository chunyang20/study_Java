package cn.day0802.yc._02interface;
/*
    引用数据类型：
        数组，类，接口，枚举
*   1.接口是全新的与类平级的一种结构【一个接口就是一个文件，也会产生class文件】
*   2.接口是用来定义规范，具体的实现有很多种【类似于抽象类里面抽象方法】

    接口的定义：
    interface 接口名{
        //成员变量--默认由public static final修饰
        //抽象方法--默认由public abstract修饰
        //静态方法
        //默认方法

    }
*
    接口和类的关系
        一个类可以同时实现多个接口
        一个雷可以同时继承一个类并实现多个接口，但是必须先继承后实现
        接口与接口之间可以继承，并且支持多继承
* */
public class interfaceTest {
    public static void main(String[] args) {
        WeChatPay chatPay=new WeChatPay();
        chatPay.pay("杨春",9999,"腾讯","皮肤");

    }

}

interface A{
    void show();
}
interface B{
    void print();
}
class D{

}
interface E extends A,B{

}
class C extends D implements E{
    @Override
    public void show() {

    }

    @Override
    public void print() {

    }
//一个类实现多个接口
}

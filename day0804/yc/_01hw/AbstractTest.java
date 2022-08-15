package cn.day0804.yc._01hw;
/*
*       抽象类
*           1.由abstract修饰的类
*           2.抽象类里面有抽象方法【有abstract修饰】，有构造方法但不能创建对象
*           3.子类必须复写未实现的方法
* */
public class AbstractTest {

}

abstract class Animal{
    //抽象方法
    abstract void useTools();
}

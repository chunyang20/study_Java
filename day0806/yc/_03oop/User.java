package cn.day0806.yc._03oop;
/*
*   User可以继承父类非私有化的属性和方法
*       1.Java里面的单继承，多层级继承
*       2.隐式继承object
*           toString    equals  hashcode    --都是继承的
*       3.方法的复写【子类与父类、实现类和接口】
*           3.1子类方法的权限修饰符必须大于等于父类权限修饰符
*           3.2子类方法的名字和形参列表必须和父类一致
*           3.3子类方法的返回值类型和父类方法的返回值类型一致，或者是其子类
*
* */
public class User extends Student{

    @Override
    void login() {
        super.login();      //默认调用父类的方法  但是没用 我们是写自己的
    }
}

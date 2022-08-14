package cn.day0802.yc._01abstract;
/*
*       共同的父类图形类里面的方法求面积和周长的功能体没有任何意义，每个子类都要复写
*       抽象类：
*           由abstract修饰的类叫做抽象类
*       抽象类和类有什么区别？
*           类里面可以写什么？
*           普通类里面的成员，构造方法，方法，属性
*           1.有构造方法 --但是不能创建对象
*           2.属性
*           3.方法
*           4.抽象方法
*       抽象方法：
*           1.没有方法体
*           2.有abstract修饰
*       作用：
*           1.必须要求子类复写此方法
*       抽象类：
*           就是对子类应该具有的方法进行统一的规范，设计了方法的形参和返回的类型，只是没有方法体
*           这些抽象方法强制子类去复写
*
* */
public abstract class Graph {
    //可以有构造方法，但是不能创建对象
    public Graph(){
    }
    //可以由属性，但是属性要通过对象来调用，所以属性也没用
    private String name;
    public abstract double getArea();
    public abstract double getGirth();


}

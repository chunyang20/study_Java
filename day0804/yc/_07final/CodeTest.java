package cn.day0804.yc._07final;
/*
*   final最终的
*       可以修饰哪些内容？  成员变量（属性），构造方法，普通方法，局部变量，内部类，外部类
*           类、成员变量、局部变量、普通方法
*
*       修饰的内容有什么作用？
*           类：          final修饰的类不能被继承
*           成员变量：     必须赋初始值并且值不能被修改
*           局部变量：       一旦赋值就不能更改了
*           普通方法：   final修饰的方法不能被复写
*
*       final修饰成员变量一般都是和static一起使用，被static和final修饰的成员变量---叫做全局常量
*       【一般用于人类公认数据的修饰，或者系统的全局变量】  比如π=3.14159265358
* */
public class CodeTest {
}
/*final*/
    class  User{
    final String username="";
    public User(){

    }
    public /*final*/ void login(){
        final String password;
        password="123";
        //password="456";  //一旦赋值就不能更改了
    }

    final class inner{

    }

}

class A extends User{
    public final void login(){
        String password;
    }
}


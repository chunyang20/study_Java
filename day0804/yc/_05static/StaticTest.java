package cn.day0804.yc._05static;
/*
*
*       static:静态的，修饰符
*           static可以修饰哪些内容？
*                   一个类里面有哪些成员？  成员变量（属性），构造方法，普通方法，局部变量，内部类
*               成员变量
*               普通方法
*               内部类【不研究】
*           static修饰的内容有什么作用？
*               成员变量：static修饰的成员变量被所有对象共享【严格来讲static修饰的成员变量要使用类名调用】
*               普通方法：叫做静态方法，调用方法的方式使用类名去调用，静态方法没有方法复写的功能，一般工具类都使用static修饰
*               方法调用：
*                   类名.方法名():   被调用的方法有static修饰
*                   对象.方法名():   被调用的方法没有static修饰
* */
public class StaticTest {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.name="孙飞燕";  //严格来讲static修饰的成员变量要使用类名调用,而不使用对象.属性来调用
        Student.name="王天霸";
        stu1.age=26;
        System.out.println(stu1.name+"今年"+stu1.age+"岁了");
        Student stu2=new Student();
        Student.name ="李逍遥";
        stu2.age=23;
        System.out.println(Student.name +"今年"+stu1.age+"岁了");
        System.out.println(Student.name +"今年"+stu2.age+"岁了");


        Student.study();    //正常调用静态方法
        stu1.study();       //使用对象调也不报错，报警告，实际上class反编译以后也是通过类调用

    }
}

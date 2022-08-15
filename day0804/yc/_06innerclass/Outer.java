package cn.day0804.yc._06innerclass;
/*
*   Outer:外部类
*   在工作中基本不这么写，但是jdk的底层大量使用了这种设计,比如Arrays类
*   工作中还是一个类就是一个java文件
*
*   class文件的编译以类来决定
*       内部类也会单独编译成一个有$符号的class文件
* */
public class Outer {
    //内部类
    class Inner1{

    }
    //静态的内部类，创建对象方式不同
    static class Inner2{

    }
}

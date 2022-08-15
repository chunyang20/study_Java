package cn.day0804.yc._08code;
/*
*   代码块：
*       语法：
*       {
*           //代码
*       }
*       代码块分类：
*       构造代码块【没用】---随着对象的创建而执行，代码块里面的内容会编译到构造方法里面
*       局部代码块【没用】---写在方法内部用于去区分代码功能的代码块
*       静态代码块【掌握】---在类里面，有static修饰的代码块
*           运行特点：
*               随着类的加载而执行，并且只是执行一次，而且运行的优先级非常高
*               类的加载：当把class文件放入JVM里面的那一刻
*
*
* */
public class CodeTest {
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        Product p4=new Product();
        Product p5=new Product();
    }
}

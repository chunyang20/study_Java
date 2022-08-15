package cn.day0804.yc._02test;
/*
*   多态的写法对于方法与属性的使用顺序问题：
*   结论：
        属性：优先使用父类---根本不用记，一般属性使用private修饰
        方法：方法复写后优先使用子类本身
            运行的时候看对象的真实类型
*
* */
public class Test02 {
    public static void main(String[] args) {
        //以前的写法，优先使用子类的属性和方法，子类没有再从父类那里继承
        Person p=new Person();
        System.out.println(p.name);
        p.show();
        //多态的写法,向上转型
        Animal p2=new Person();
        System.out.println(p2.name);        //属性用父类的
        p2.show();                          //方法用子类的，子类没有复写再去找父类的
    }
}

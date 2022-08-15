package cn.day0804.yc._02test;
/*
    基本数据类型--->类型的转换  隐式  强制
*   多态：
        向上转型：
              1.使用父类类型接收子类对象
              2.使用接口接收实现类对象
    官方说法：
        编译时类型和运行时类型不一致的情况叫多态

        向下转型:       类似于基本数据类型的强制转换
              1.子类类型 子类变量=(子类类型) 父类变量
*
*
*
*
* */
public class Test {

    public static void main(String[] args) {
        //正常的写法
        Person p1=new Person();
        //多态的写法---向上转型
        Animal a=new Person();      //编译看左边，运行看右边
        //编译时类型：一眼能看到a是Animal，并且在编写的时候可以使用Animal里面的属性和方法
        //运行时类型：当代码实际运行的时候a的真实类型，不管转没转型，a的实际类型是Person
        System.out.println(a.name);

        //   不能调子类的属性和方法，因为编译时是Animal父类类型
        //System.out.println(a.intro);
        //System.out.println(a.coding());

        System.out.println("向下转型前"+a.getClass());
        //需要调子类的属性和方法必须向下强制转型
        Person person=(Person)a;
        //父类的属性name如果子类也有就调用子类的属性，子类没有就调用父类的属性
        System.out.println(person.name);   //父类属性子类没有
        System.out.println(person.intro);   //子类特有属性
        person.coding();                    //子类特有方法
        System.out.println("向下转型后"+a.getClass());

        /*      错误写法
        Pig p2=new Animal();
        Pig p3=new Person();
        Person p4=new Pig();
        */
    }
}

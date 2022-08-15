package cn.day0804.yc._04test;
/*
*       基本数据类型转换--强制转换
*       byte b=(byte)128;
*       精度损失：b最终的结果是-128
*
*       向下转型的风险：
*           可能出现类型转换异常,把一个对象转换为非真实类型【ClassCastException】
*       比较运算：
*           instanceof：判断一个对象是否属于某个类的实例
* */
public class ChangeTest {
    public static void main(String[] args) {
        Animal p1=new Person();
        Animal p2=new Pig();
        //强制转换：
        Person pr=(Person) p1;

        Pig pg=(Pig) p2;
        System.out.println("强制转换结束");
        System.out.println(p1 instanceof Person);   //判断p1对象是不是属于Person类
        System.out.println(p1 instanceof Pig);
        // Pig pig=(Pig) p1;       //把人强制转换为猪，没有编译错误，但是会报强制转换异常
        // Person person=(Person) p2;
    }
}
class Animal{

}
class Person extends Animal{

}
class Pig extends Animal{

}

package day0730.yc._02extends;

public class ExtendsTest {
    public static void main(String[] args) {
        Animal a1=new Animal();         //创建Animal对象
        a1.name="天蓬";
        a1.age=987;
        a1.sex=true;
        a1.move();
        //创建Person对象，是否能继承父类的属性和方法
        Person p1=new Person();
        p1.name="王天霸";
        p1.age=37;
        p1.sex=true;
        System.out.println(p1.getClass());
        p1.move();
        //创建Pig对象，证明类与object的关系
        Pig pig=new Pig();
        System.out.println(pig.getClass());
    }
}

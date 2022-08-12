package day0730.yc._03override;

public class OverrideTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.move();              //调用的是子类的方法
        System.out.println(p1.name);        //当前对象p1的成员属性

        Snake s1=new Snake();
        s1.move();              //调用子类的move方法
        System.out.println(s1.name);        //子类没有name属性，去找父类的name

    }
}

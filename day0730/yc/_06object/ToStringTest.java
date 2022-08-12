package day0730.yc._06object;

public class ToStringTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("孙猴子");
        p1.setAge(500);
        p1.setPhone("15257846454");

        System.out.println("底层自动调用"+p1);        //打印对象其实就是在调用对象的toString()方法
        String str=p1.toString();                   //证明toString()的源码是return getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println("自己调用方法"+str);
        String code=Integer.toHexString(p1.hashCode());         //toHexString转化为16进制
        System.out.println(code);
        String name=p1.getClass().getName();
        System.out.println(name);
        System.out.println(p1.getPhone());
    }
}

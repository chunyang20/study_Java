package day0730.yc._06object;

public class ObjectTest {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();
        /*
        * 哈希码值：
        * 在java里面看成是对象在内存上的存储地址
        * 哈希码不一致，一定是不同的两个对象
        * 哈希码一致：也有可能不是同一个对象--哈希碰撞
        *
        * */
        System.out.println(p1.hashCode());      //讲16进制转成10进制
        int code=p1.hashCode();
        int code2=p2.hashCode();
        System.out.println(code);
        System.out.println(code2);
        System.out.println(p1);                 //16进制的地址值
    }
}

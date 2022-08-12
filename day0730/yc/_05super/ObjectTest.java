package day0730.yc._05super;

/*
*           HashCode
*
* */

public class ObjectTest {
    public static void main(String[] args) {
        ObjectTest objectTest=new ObjectTest();
        int a=objectTest.hashCode();        //返回对象的hashcode值
        System.out.println(a);
        System.out.println(objectTest);         //对应16进制
    }
}

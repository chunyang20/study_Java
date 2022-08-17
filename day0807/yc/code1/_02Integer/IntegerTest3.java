package cn.day0807.yc.code1._02Integer;
/*

        享元模式
            java底层把【-128,127】之间的数字都已经缓存好了
            结论：Integer是引用数据类型，比较两个对象是否相等，还是应该使用equals




 */
public class IntegerTest3 {
    public static void main(String[] args) {
        Integer i1=127;
        Integer i2=127;
        Integer i3=128;
        Integer i4=128;

        Integer i5=new Integer(127);
        Integer i6=new Integer(127);
        System.out.println(i1==i2);     //true
        System.out.println(i3==i4);     //false
        System.out.println(i5==i6);     //false
        System.out.println(i1==i5);     //false
        int i7=128;
        System.out.println(i7==i4);     //引用数据类型拆箱，比较字面值    true
        System.out.println(i1.equals(i2));  //true
        System.out.println(i3.equals(i4));  //true
        System.out.println(i5.equals(i6));  //true
        System.out.println(i1.equals(i5));  //true


    }
}

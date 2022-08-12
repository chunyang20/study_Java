package day0730.yc._06object;

public class EqualsTest {
    @Override
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("孙猴子");
        p1.setAge(500);
        p1.setPhone("15257846454");
        Person p2=new Person("孙猴子",500,"15257846454");
        System.out.println(p1==p2);    //地址值不一样
        /*
        *
        * ==一般用于比较基本数据类型
        *   如果比较引用数据类型，比较的是对象的地址值
        *   但是如果是常量池就是相等的
        *
        *   对象是否相等，判断标准是地址值还是数据？
        *       业界认为一般数据相等就是相等的
        *       equals方法能够去比较两个对象是否相等
        * */
        String s1="ABC";
        String s2="ABC";
        System.out.println(s1==s2);

        System.out.println(p1.equals(p2));          //还是false，因为代码底层用的==，要重写equals方法

    }

}

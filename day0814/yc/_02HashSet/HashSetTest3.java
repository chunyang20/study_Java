package cn.day0814.yc._02HashSet;

/**
 * @author 杨春
 * @DATE 2022/8/15 9:08
 */

import java.util.HashSet;

/**
    HashSet去重的标准

    推断过程：
        1.HashSet添加数据的时候，狠hashCode和equals有关
        2.HashSet添加数据的时候，add方法的底层调用hashCode和equals方法

    结论：HashSet的标准，类里面的equals和hashCode值决定对象是否重复

 */
public class HashSetTest3 {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        //第一次添加数据没有调用equals方法，因为没有别的对象比较
        User u1=new User("陆小果",24);
        set.add(u1);
        System.out.println(u1.hashCode());
        User u2=new User("橙留香",24);
        set.add(u2);
        System.out.println(u2.hashCode());
        User u3=new User("菠萝吹雪",24);
        set.add(u3);
        System.out.println(u3.hashCode());
        User u4=new User("橙留香",24);
        set.add(u4);
        System.out.println(u4.hashCode());
        System.out.println(set);
        //只有当equals和hashcode都相等的时候才认为是同一个对象，判断数据重复不添加

    }
}

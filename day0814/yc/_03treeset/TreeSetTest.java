package cn.day0814.yc._03treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 杨春
 * @DATE 2022/8/14 10:02
 */

/*
    无序，不重复

    1.TreeSet的基本使用【常用方法】
    2.TreeSet的遍历【不讲】

    TreeSet可以进行排序而且必须排序，如果有两个类型以上数据存储的时候就不能排序
    TreeSet储存的数据必须是有序，存储的内容必须去实现Comparable或者使用定制排序comparator

 */
public class TreeSetTest {
    public static void main(String[] args) {
        //创建TreeSet的对象
        TreeSet set=new TreeSet();
        Person p1=new Person("猛虎王",15);
        Person p2=new Person("暴龙神",15);
        Person p3=new Person("狂野猩",15);
        Person p4=new Person("千仞雪",15);
        Person p5=new Person("千寻疾",25);
        Person p6=new Person("千道流",26);
        set.add(p1);
        System.out.println("--------------------");
        set.add(p2);
        System.out.println("-------------------");
        set.add(p3);
        System.out.println("-------------------");
        set.add(p4);
        System.out.println("-------------------");
        set.add(p5);
        System.out.println("-------------------");
        set.add(p6);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println("遍历数据:");
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

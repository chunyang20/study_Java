package cn.day0814.yc._03treeset;

/**
 * @author 杨春
 * @DATE 2022/8/14 12:19
 */

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Set:无序不重复
 *
 * 	1.TreeSet的基本使用【常用方法】
 * 	2.TreeSet的遍历【不讲】
 *
 * TreeSet-数据可以进行排序【必须】，如果有两个类型以上数据存储的时候 就不能排序
 * TreeSet储存的数据必须是有序，存储的内容必须去实现Comparable或者使用定制排序Comparator
 * 	自然排序：存储的类型实现Comparable接口
 * 	定制排序：在创建对象的时候传入排序规则
 *
 *  作业：
 *  	如果一个类同时拥有自然排序和定制排序，请测试两种排序的优先级
 *
 *
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        //创建TreeSet的对象
        /*
         * TreeSet(Comparator comparator)  构造一个新的，空的树集，根据指定的比较器进行排序。
         *
         */
        //创建定制规则容器
        Comparator comparator=new StudentRule();
        TreeSet set=new TreeSet(comparator);
        Student s1=new Student("急先锋",28);
        Student s2=new Student("霹雳火",22);
        Student s3=new Student("龙卷风",25);
        Student s4=new Student("力霸天",26);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}

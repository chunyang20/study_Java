package cn.day0814.yc._02HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 杨春
 * @DATE 2022/8/14 17:12
 */
/*
   Set研究的内容：
     1.常用方法【维护set容器里面存储逇数据】
     2.set的遍历【把容器里面的数据依次取出来】
     3.不同的Set容器判断重复的标准【难点】

   Set：无序，不可重复列表
        HashSet
        TreeSet

   常用方法：
        boolean add(E e)  如果指定的元素不存在，则将其指定的元素添加（可选操作）。
        void clear()  从此集合中删除所有元素（可选操作）。
        boolean contains(Object o)  如果此集合包含指定的元素，则返回 true 。
        Iterator<E> iterator()  返回此集合中元素的迭代器。
        int size()  返回此集合中的元素数（其基数）。
        boolean remove(Object o)  如果存在，则从该集合中删除指定的元素（可选操作）。

    【和list对比，set里面没有根据索引操作数据的相关方法】

    HashSet构造方法：
        HashSet() 构造一个新的空集合; 背景HashMap实例具有默认初始容量（16）和负载因子（0.75）。
 */
public class HashSetTest2 {
    public static void main(String[] args) {
        //创建一个Set容器---无序，不重复的容器
        HashSet set=new HashSet();
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("A");
        set.add(5);
        set.add(8);
        set.add(1);
        set.add("杨过");
        set.add("小龙女");
        set.add("郭靖");
        /*
            遍历数据方式一：foreach
         */
        for (Object o:set ) {
            System.out.println(o);
        }
        /*
            遍历数据方式二：迭代器Iterator
         */
        //获取迭代器对象
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

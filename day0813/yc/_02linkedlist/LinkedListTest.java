package cn.day0813.yc._02linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 杨春
 * @DATE 2022/8/13 11:22
 */

/*

    List   列表，有序可重复的列表
        有序：添加的顺序，不指代数据的升序降序
        ArrayList
        LinkedList

    常用方法：
    boolean add(E e)将指定的元素追加到此列表的末尾（可选操作）。
    void clear()从此列表中删除所有元素（可选操作)。
    boolean contains(0bject o)如果此列表包含指定的元素，则返回true
    E get(int index)    返回此列表中指定位置的元素。
    E remove(int index)     删除指定下标的元素
    Object [] toArray[]     把集合转换为数组
    int size()              返回数组的长度


    ArrayList--List的基于数组的实现类,线程不安全的
    ArrayList()
    构造一个初始容量为十的空列表。

    List的遍历


 */

public class LinkedListTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(11);
        list.add("杨春");
        list.add(19);
        list.add(9);
        list.add(13);
        System.out.println(list.contains("杨春"));
        System.out.println(list.get(5));
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.toArray());
        System.out.println(list.size());

        //List的遍历方式一：普通for循环
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
        }
        System.out.println("----------");
        //List的遍历方式二：增强for循环
        for (Object obj : list) {
            //数据源：数组，只要是Iterable的实例就可以使用增强for循环
            //System.out.println(obj);
        }
        System.out.println("---------");
        /*
            List的遍历方式三：迭代器
                |--Iterator<E> iterator()   返回迭代器对象。
            Iterator
                boolean hasNext()如果迭代具有更多元素，则返回true.
                E next()返回迭代中的下一个元素。
                default void remove()从底层集合中删除此迭代器返回的最后一个元素（可选操作）。
             */

        //获取迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
            iterator.remove();      //先调用next方法才能调用remove方法
        }
        System.out.println("------");
        System.out.println(list);
    }
}

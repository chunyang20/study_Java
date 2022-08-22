package cn.day0813.yc._03hashset;



import java.util.HashSet;
import java.util.Iterator;


/**
 * @author 杨春
 * @DATE 2022/8/13 14:07
 */
/*
    set研究的内容:
    1.常用方法【维护set容器里面存储地数据】
    2.set的遍历【把容器里面的数据依次取出来】
    3.不同的set容器判断重复的标准【难点】


    set无序，不可重复
        HashSet
        TreeSet
    常用方法:
    boolean add(E e)如果指定的元素不存在，则将其指定的元素添加（可选操作）。
    void clear()从此集合中删除所有元素（可选操作)。
    boolean contains (Object o)如果此集合包含指定的元素，则返回true 。
    Iterator<E> iterator()返回此集合中元素的迭代器。
    int size()返回此集合中的元素数（其基数）。
    boolean remove(Object o)如果存在，则从该集合中删除指定的元素(可选操作）。

    【和set对比，set里面没有根据索引操作数据的相关方法】

    Hashset构造方法:
    Hashset()构造一个新的空集合;背景HashMap实例具有默认初始容量（16)和负载因子（0.75)。


 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //添加数据
        /*
         * 无序:添加顺序,和数据的存放顺序不一致
         * HashSet不具备数据的排序能力
         */


        set.add(5);
        set.add("A");
        set.add("Z");

        set.add(79);
        set.add(54);
        System.out.println(set);
        System.out.println(set.contains("B"));
        set.remove(79);
        System.out.println(set.size());
        /*
            遍历数据
                for
                foreach
                迭代器
         */
        for (Object obj:set
             ) {
            System.out.println(obj);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*

        StringBuffer sb=new StringBuffer("[");
        for (Object o:set
             ) {
            sb.append(o).append(",");

        }
        sb.append("]");
        System.out.println(sb);
        */
    }
}

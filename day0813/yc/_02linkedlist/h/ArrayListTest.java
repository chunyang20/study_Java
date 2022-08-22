package cn.day0813.yc._02linkedlist.h;

/**
 * @author 杨春
 * @DATE 2022/8/13 11:48
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest{
    public static void main(String []args){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("杨春");
        list.add(5);
        list.add(6);
        //查询容器里面的内容
        System.out.println(list);
        //查询容器里面的数据个数
        System.out.println(list.size());
        //删除指定的索引数据
        System.out.println(list.remove(3));
        System.out.println(list.get(4));
        System.out.println();
        //遍历方式一
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //遍历方式二
        for(Object obj:list){
            System.out.println(obj);
        }
        //遍历方式三
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
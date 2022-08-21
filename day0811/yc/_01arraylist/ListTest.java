package cn.day0811.yc._01arraylist;

/**
 * @author 杨春
 * @DATE 2022/8/11 10:04
 */
public class ListTest {
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        //期望的操作:MyArrayList提供一个方法 add往容器里面添加数据
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(8);
        list.add("唐三");
        list.add(8);
        list.add(false);
        list.add(true);
        list.add(true);
        list.add(8);
        list.add(true);
        list.add(new User("小舞",29));
        System.out.println("查看容器里面的所有数据");
        System.out.println(list);
        System.out.println("查看容器里面存储的数据的个数");
        System.out.println(list.size());
        System.out.println("根据索引查看里面的内容");
        System.out.println(list);
        System.out.println(list.getByIndex(3));
        System.out.println("查找第一次出现的位置");
        System.out.println(list);
        System.out.println(list.getFirstIndex(6));
        System.out.println("查询最后一次出现的位置");
        System.out.println(list);
        System.out.println(list.getLastIndex(0));
        System.out.println("出现的次数");
        System.out.println(list);
        System.out.println(list.getCount(2000));
        System.out.println("根据索引修改数据");
        list.updateByIndex(11,"杨春");
        System.out.println(list);
        System.out.println("只替换第一个数据");
        list.replaceFirst(8,88);
        System.out.println(list);
        System.out.println("替换所有数据");
        list.replaceAll(5,55);
        System.out.println(list);
        System.out.println("根据索引删除数据");
        list.remove(6);
        System.out.println(list);
        System.out.println("删除指定数据");
        list.delete(6);
        System.out.println(list);
        System.out.println("删除指定数据删除在容器里面全部指定数据");
        System.out.println(list.size());
        list.deleteAll(55);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("-----------------");
        MyArrayList list2 = new MyArrayList(100);
        //期望的操作：MyArrayList 提供一个方法 add 往容器里面添加数据
        list2.add(9);
        list2.add(19);
        list2.add(29);
        list2.add(39);
        list2.add(49);
        list2.add(59);
        list2.add(99);
        System.out.println(list2);
        System.out.println(list2.size());

    }
}

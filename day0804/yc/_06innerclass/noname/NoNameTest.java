package cn.day0804.yc._06innerclass.noname;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
*
*       匿名内部类
*           过度知识，为后面学习另外一个知识做准备
*           1.单独写一个类实现接口太麻烦了
*           2.把类的创建，接口的实现，对象的创建 揉在一起
*
* */
public class NoNameTest {
    public static void main(String[] args) {
        //创建一个PayWay接口的实现类对象
        Alipay a1=new Alipay();
        //接口的多态写法（向上转型）
        PayWay a2=new Alipay();
        //匿名内部类写法
        PayWay a3=new PayWay() {
            @Override
            public void pay() {
                System.out.println("银联支付666");
            }
        };
        //如果一个接口有很多种抽象方法，就不适合这么写，而改用lambda表达式

        //lambda表达式写法
        PayWay a4= () -> System.out.println("京东支付999");
        //都可以调用pay方法
        a1.pay();
        a2.pay();
        a3.pay();
        a4.pay();
        //十几种抽象方法
        List list=new List() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator listIterator() {
                return null;
            }

            @Override
            public ListIterator listIterator(int index) {
                return null;
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                return null;
            }
        };




    }
}

//单独写一个类实现接口
class Alipay implements PayWay{

    @Override
    public void pay() {
        System.out.println("支付宝到账99元");
    }
}
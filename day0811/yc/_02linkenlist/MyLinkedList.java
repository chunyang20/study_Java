package cn.day0811.yc._02linkenlist;

/**
 * @author 杨春
 * @DATE 2022/8/11 15:50
 */
/*
MyLinkedList:基于链表实现的容器
1.准备一个节点类型Node---1.记录数据2.记录上一个节点 3.记录下一个节点
2.add每添加一个数据，新生成一个Node的对象，把当前的这个对象地址值赋值给链表的最后一个
3.定义两个成员变量,始终记录链表的头和尾
 */
public class MyLinkedList {
    //记录链表的头
    private Node first;
    //记录链表的尾
    private Node last;


    public void add(Object o){
        // add每添加一个数据,新生成一个Node的对象
        Node node=new Node(o);
        if (first==null){       //第一个数据
            first=node;
            last=node;
        }else {
            //找到当前节点的上一个
            last.next=node;
            //对上一个节点 设置下一个为node
            node.pre=last;
            //始终把当前新添加的节点设置为最后一个
            last=node;
        }

    }

    @Override
    public String toString() {
        //输出打印容器里面存储的内容
        /*
            使用while循环从第一个节点  依次往后查找数据
        */
        Node n=first;
        StringBuffer sb=new StringBuffer("[");

        while (n.next!=null){
            //取出数据
            sb.append(n.e).append(", ");
            //n不等于null，继续往下取n
            n=n.next;
        }
        //最后一个数据单独处理
        sb.append(n.e).append("]");
        return sb.toString();
    }
}
class Node{
    //1.记录数据
    Object e;
    //2.记录上一个节点
    Node pre;
    //3.记录下一个节点
    Node next;

    public Node(Object e){
        this.e=e;
    }
}
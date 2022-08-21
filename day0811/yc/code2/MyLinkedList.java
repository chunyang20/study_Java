package cn.day0811.yc.code2;

public class MyLinkedList {
    //表示节点的头
    private Node first;
    //始终表示节点的尾部
    private Node last;

    public void add(Object o){
        Node node=new Node(o);
        if (first==null){
            first=node;
            last=node;
        }else {
            //找到当前节点的上一个
            last.next=node;
            //把上一个节点设置成当前节点的头部
            node.pre=last;
            //把当前节点设置成尾部
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
    //节点的上一个节点
    Node pre;
    //存储当前数据
    Object e;
    //节点的下一个节点
    Node next;
     public Node(Object e){
         this.e=e;
     }
}

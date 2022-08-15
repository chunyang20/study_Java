package cn.day0804.yc._08code;

public class Product {
    //静态代码块
    static {
        System.out.println("系统初始化完成");
    }


    //构造代码块【没用】写在类里面的代码块
    {
        //System.out.println("都是勇敢的");     //卸载这里会自动写在构造方法里面
    }
    public Product(){
        System.out.println("都是勇敢的");
        System.out.println("无参构造方法");
    }

    public void show(){
        //局部代码块
        {
            System.out.println("局部代码块");
        }
    }
}

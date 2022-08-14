package cn.day0802.yc._02interface;
/*
*   接口的语法
*   public interface 接口名{
*   }
*   接口里面可以有的内容
*       1.成员变量，默认是由public static final修饰的
*       2.没有构造方法---->不能创建对象
*   3.只能有抽象方法【重点】
*       4.静态方法【由static修饰】
*       5.默认方法【由default修饰】
*  */
public interface PayWay {
    //写成员变量
    int i=10;
    /*public PayWay(){

    }*/
    //在接口中  public abstract都是不用写的，写不写都没有用
    void pay(String acc, double money, String person, String dis);
    void query(String order);
    void refund(String order);
}

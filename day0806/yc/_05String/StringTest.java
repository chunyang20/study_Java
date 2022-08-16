package cn.day0806.yc._05String;
/*
构造方法：
   String(String original)初始化新创建的String对象，使其表示与参数相同的字符序列; 换句话说，新创建的字符串是参数字符串的副本。

        "a"          new String("a");
        "西门吹雪"     new String("西门吹雪");
        "朴恩惠"       new String("朴恩惠");

        字符串不变：他们的值在创建后不能被更改
        每一个不同的字符串，都会在内存上面生成一个对应的地址值

 */
public class StringTest {
    public static void main(String[] args) {
        //正常创建对象---使用构造方法创建对象
        String str1=new String("ABC");  //创建一个对象初始值为ABC
        System.out.println(str1);
        String str2="A"+"BC";
        System.out.println(str1==str2);
        //以下三个有什么区别
        String str5=new String();
        String str6=null;           //没有记录指向任何的内存区域--不能去调用方法，空指针异常
        String str7="";
        System.out.println(str5+"str5");

        System.out.println(str6+"str6");

        System.out.println(str7+"str7");

    }
}

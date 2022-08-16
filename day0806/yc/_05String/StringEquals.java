package cn.day0806.yc._05String;
/*
*       常量池
*
*
* */
public class StringEquals {
    public static void main(String[] args) {
        String str1="ABC";
        String str2="A"+"BC";       //编译以后直接就是ABC，直接检查常量池ABC这个字符串，如果有直接获取地址值
        String str5="A";
        String str6=str5+"BC";
        //凡是new出来的都不会用常量池，都会新建一个对象
        String str3=new String("ABC");
        String str4=new String("ABC");
        /*
            写法不对
            基本数据类型比较==
            引用数据类型比较equals
         */
        System.out.println(str5==str6);
        System.out.println(str1==str2);
        System.out.println(str2==str3);     //讲道理是true，但是涉及常量池
        System.out.println(str3==str4);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));

    }
}

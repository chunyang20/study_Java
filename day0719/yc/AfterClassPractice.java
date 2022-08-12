package day0719.yc;
/*
*       1. 使用int类型 声明变量age1和age2。
        age1 赋值为自己的年龄。
        int age1 = 18;
        age2 赋值为朋友的年龄。
        int age2 = 31;
        计算出年龄之和。
        int sum=age1+age2;

        2.	使用String类型声明姓名name，int类型声明年龄age
        如：姓名为：小明 年龄：20
        打印语句输出： 姓名 ：小明 年龄：20 岁
        String name=”小明”;
        Int age = 20;
        syso(“姓名:”+name+” 年龄:”+age+”岁”);

        3.	编写程序交换两个变量的值，如：int a = 3,int b = 5交换两个变量的值，交换后：a = 5,b = 3;(要创建第三个盒子，临时装值)
*
* */
public class AfterClassPractice {
    public static void main(String[] args) {
        int age1=18;
        int age2=31;
        int sum=age1+age2;
        System.out.println("年龄之和："+sum);
        System.out.println("*******************");

        String name="小杨";
        int age=24;
        System.out.println("姓名："+name+",年龄:"+age);
        System.out.println("*******************");

        int a=3,b=5;
        int c=a;
        a=b;
        b=c;
        System.out.println("a的值:"+a+"\nb的值:"+b);
    }
}

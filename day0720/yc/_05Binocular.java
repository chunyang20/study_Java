package day0720.yc;

import java.util.Scanner;

/*
*   三元运算：
*   x?y:z;
*   x必须是一个布尔值（TRUE，FALSE）
*   Boolean类型的变量
*   y:结果为true
*   z:结果为false
*
*
* */
public class _05Binocular {
    public static void main(String[] args) {
        System.out.println(5>3?"max:"+5:"max:"+3);
        boolean b=true;
        System.out.println(b?"A":"B");
        b=false;
        System.out.println(b?"A":"B");


        //定义一个变量【作为判断的数字】
        //奇数偶数的判断6
        Scanner x=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int y=x.nextInt();
        System.out.println((y%2==0)?y+"是偶数":y+"是奇数");
    }
}

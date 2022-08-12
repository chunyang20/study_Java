package day0723.yc;

import java.util.Arrays;

/*
*   数组
* */
public class Array {
    public static void main(String[] args) {
        int []b;            //声明
        b=new int[5];       //创建数组，指定长度，默认0
        String []c={"北京","上海","广东","深圳"};   //静态声明
        int [] a=new int[10];
        for (int i=0;i<=9;i++){
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        String s1="I love jAva.java is the best language.java 666";
        String s2="     i love java     ";
        System.out.println(s1.equals(s2));
        System.out.println(s1.toLowerCase());           //转小写
        System.out.println(s2.toUpperCase());           //转大写
        System.out.println(s1.length());                //字符串长度
        System.out.println(s1.charAt(5));               //返回下标为5的字符
        System.out.println(s1.indexOf("java"));         //返回该字符第一次出现的下标
        System.out.println(s1.lastIndexOf("java")); //从右往左第一个字符的下标
        System.out.println(s1.isEmpty());               //是否为空
        System.out.println(s2.trim());                  //删除该字符串的前后空格符
        System.out.println(s1.codePointAt(8));

        /*
         * 数据类型[]  数组名=new 数据类型[长度];
         */
        //定义一个长度为8的int数组
        int[] arr = new int[8];

        //定义一个String数组，长度为5
        String[] arr2=new String[5];
        //定义一个char 数组 长度为6；
        char[] arr3=new char[6];
        boolean[] bool = new boolean[10];
        /*
         * 数组的赋值
         * 	数组名[索引] = 值;
         */
        //给arr数组里面的第一个位置赋值为56
        arr[0]=56;
        arr[2]=57;
        arr[3]=58;
        //如果给数组索引位置为8的地方赋值  --ArrayIndexOutOfBoundsException
        //arr[8]=66;
        //给String数组赋值
        arr2[0]="唐三";
        arr2[1]="小舞";
        arr2[2]="奥斯卡";
        arr2[3]="比比东";

        /*
         * 数组的取值：
         * 	数组名[索引]
         * 取出来的值如何使用：
         * 		1.使用变量接收 --数组是什么类型，取出来的值使用什么类型去接收
         * 		2.直接打印
         */
        int val = arr[0];
        String val2 =arr2[0];
        System.out.println(val);
        System.out.println(val2);
        //2.直接打印
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);
        System.out.println(arr2[4]);//null
        System.out.println(bool[1]);//false


        //组员
        String[]our=new String[12];


    }
}

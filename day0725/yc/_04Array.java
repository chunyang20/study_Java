package day0725.yc;

import java.util.Arrays;

/*
*       数组的下标范围【0-length-1】
*       数组一旦创建，长度不变
*
* */
public class _04Array {
    public static void main(String[] args) {
        int[]arr;
        arr=new int[4];

        String[]str;
        str=new String[]{"中","国","梦"};

        int[]arr2=new int[4];
        arr2=new int[10];       //创建新的数组长度为10不改变原来的，指向不同
        System.out.println(Arrays.toString(str));

        System.out.println("求出数组中的最大值");
        int[]arr3={5,3,9,64,8,35,1,19,37};
        int max=arr3[0];
        int min=arr3[0];
        for (int i = 0; i <arr3.length; i++) {
            if (arr3[i]>=max){
                max=arr3[i];
            }
            if (arr3[i]<=min){
                min=arr3[i];
            }
        }
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);

        //请将“我“，”爱“，“你”存入数组，正者反着输出
        String str1[]={"你","爱","我"};
        for (int i=0;i<str1.length;i++){
            System.out.print(str1[i]+"\t");
        }
        System.out.println();
        for (int i= str.length-1;i>=0;i--){
            System.out.print(str1[i]+"\t");
        }

    }
}

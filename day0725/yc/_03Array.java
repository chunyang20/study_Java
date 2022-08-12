package day0725.yc;

import java.util.Arrays;

/*
 *
 *   数据类型：
 *   引用数据类型：
 *       类
 *       数组
 *       枚举
 *       接口
 *       for(数据类型 变量名：数据源){
 *             //直接使用变量就是每一个数据
 *       }
 *       数据源：数组，集合
 *       数据类型 变量名：定义一个变量 接收数组里面的每一个数据
 *
 *      凡事要使用索引的操作，增强for都不适用
 * */
public class _03Array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int []arr2={1,2,3,4,5,6,7,8,9};

        for (int a:arr){                    //增强for
            System.out.print(a+"\t");
        }

        System.out.println("\n"+Arrays.toString(arr2));
    }


}

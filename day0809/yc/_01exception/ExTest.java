package cn.day0809.yc._01exception;
/**
 * @author 杨春
 * @DATE 2022/8/9 9:27
 */
/*
已经见过的异常：

- NullPointerException--->空对象调用方法
- ArithmeticException--->不符合数学规范
- ArrayIndexOutOfBoundsException--->数组索引超出边界异常
- ClassCastException--->类转换异常
 */

public class ExTest {
    public static void main(String[] args) {
        /*
            NullPointerException--->空对象调用方法
            String s=null;
            System.out.println(s.charAt(1));
         */

        /*
            ArithmeticException--->不符合数学规范
            System.out.println(1 / 0);
         */

        /*
        ArrayIndexOutOfBoundsException--->数组索引超出边界异常
            int[]arr={1,2,3};
            System.out.println(arr[4]);
        */


        /*
        ClassCastException--->类转换异常
            Integer i=10;
            Number n=i;
            Byte b=(Byte)n;
         */


    }
}

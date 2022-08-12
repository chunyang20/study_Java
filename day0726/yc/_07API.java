package day0726.yc;

import java.util.Arrays;

public class _07API {
    public static void main(String[] args) {
        //返回传入数组的最大值
        int[]ar={1,5,2,5,128,5456,98,21,3};
        //排序
        System.out.println(_07API.getMax(ar));
        //没有返回值类型，不能直接放进打印语句
        //System.out.println(Arrays.sort(ar));

        //toString方法      类名.方法名(参数)
        System.out.println(Arrays.toString(ar));

    }

    public static int getMax(int[]a){
        //先对数组进行排序
        Arrays.sort(a);
        //返回最大值，最后一个数就是最大值，第一个就是最小值
        return a[a.length-1];
    }


}

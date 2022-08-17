package cn.day0807.yc.code2._04system;

import java.util.Arrays;

/**
 * @author 杨春
 * @DATE 2022/8/8 10:36
 */
public class SystemTest {
    public static void main(String[] args) {
        /*
            System:
                字段:
                    in:输入
                    out:输出
                    err:错误输出，红色字体输出
        */
        //Scanner sc=new Scanner(System.in);
        //System.out.println("请输入账号：");
        //System.out.println(sc.next());
        System.out.println("你好");
        System.err.println("错误输出");
        /*
        方法：
             static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  将指定源数组中的数组从指定位置复制到目标数组的指定位置。
             	src:数据源，从哪里去拷贝数据
             	srcPos：从数据源的哪个位置开始拷贝
             	dest：目标，数据拷贝到哪里去
             	destPos：从目标的哪一个位置开始放
             	length:要拷贝多少个
        */
        int []oldArray={55,3,2,4,6,9,8,7};
        int []newArray=new int[10];
        System.arraycopy(oldArray,2,newArray,3,5);
        System.out.println(Arrays.toString(newArray));
        /*
            static long currentTimeMillis()  返回当前时间（以毫秒为单位）。
            static void exit(int status) 终止当前运行的Java虚拟机。
            static void gc() 运行垃圾回收器。
            static Properties getProperties()  确定当前的系统属性。
        */
        System.out.println(System.currentTimeMillis());     //返回当前时间（以毫秒为单位）。
        //System.exit(0);                             //终止当前运行的Java虚拟机,则后面写的代码不运行
        System.out.println(System.getProperties());
    }
}

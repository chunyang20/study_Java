package cn.day0807.yc.code1._04system;

/**
 * @author 杨春
 * @DATE 2022/8/7 14:30
 */
/*
    获取Runtime类型的对象：
        static Runtime getRuntime()  返回与当前Java应用程序关联的运行时对象。

    方法:
    long freeMemory() 返回Java虚拟机中的可用内存量。
    Process exec(String command)    打开一些程序
    long totalMemory()      返回java虚拟机中的内存总量
    void gc()           运行垃圾回收器


 */
public class RunTimeTest {
    public static void main(String[] args) throws Exception{
        //获取runtime类型的对象
        Runtime runtime=Runtime.getRuntime();
        //只能打开c:/windows/system32
        //runtime.exec("calc");                 //打开计算器
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
    }
}

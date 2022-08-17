package cn.day0807.yc.code2._04system;

import java.io.IOException;

/**
 * @author 杨春
 * @DATE 2022/8/8 10:49
 */
public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        /*
           获取Runtime类型的对象：
             static Runtime getRuntime()  返回与当前Java应用程序关联的运行时对象。
           方法：
        	Process exec(String command)  在单独的进程中执行指定的字符串命令。
        	long freeMemory()  返回Java虚拟机中的可用内存量。
        	void gc()  运行垃圾回收器。
        	long totalMemory()  返回Java虚拟机中的内存总量。
        */
        Runtime runtime=Runtime.getRuntime();
        System.out.println(runtime);
        //runtime.exec("calc");     //只能打开c:/Windows/system32/
        System.out.println(runtime.freeMemory());
        runtime.gc();
        System.out.println(runtime.totalMemory());
    }
}

package cn.day0807.yc.code1._05gc;

/**
 * @author 杨春
 * @DATE 2022/8/7 15:17
 */
public class Student {
    //当gc收回垃圾的时候，会调用这个方法显示的告诉我们垃圾回收了
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾已被回收");
    }
}

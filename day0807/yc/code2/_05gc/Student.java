package cn.day0807.yc.code2._05gc;

/**
 * @author 杨春
 * @DATE 2022/8/8 10:58
 */
public class Student {
    //当gc收回垃圾的时候，会调用这个方法显示的告诉我们垃圾回收了

    /*
            Object
                protected void finalize()  当垃圾收集确定不再有对该对象的引用时，垃圾收集器在对象上调用该对象。
        */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾已被回收");
    }
}

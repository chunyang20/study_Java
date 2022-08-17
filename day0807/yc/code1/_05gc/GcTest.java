package cn.day0807.yc.code1._05gc;

/**
 * @author 杨春
 * @DATE 2022/8/7 15:07
 */
/*

    System
        static void gc()    运行垃圾回收器
    Runtime
        void gc()
    Object
        protected void finalize()  当垃圾收集确定不再有对该对象的引用，垃圾收集器在对象上调用该对象

    java自动回收垃圾



 */
public class GcTest {
    public static void main(String[] args) {
        for (int i = 0; i <6 ; i++) {
            System.out.println(new Student());
        }
        //运行垃圾回收
        System.gc();
    }
}

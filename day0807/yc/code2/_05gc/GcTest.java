package cn.day0807.yc.code2._05gc;

/**
 * @author 杨春
 * @DATE 2022/8/8 10:58
 */
public class GcTest {
    public static void main(String[] args) throws Throwable {
        for (int i = 0; i < 5; i++) {
            System.out.println(new Student());

        }
        /*
          System
          	static void gc()  运行垃圾回收器。
        */
        //System.gc();
        /*
            Runtime
                void gc()  运行垃圾回收器。
        */
        //Runtime rt=Runtime.getRuntime();
        //rt.gc();



    }
}

package cn.day0807.yc.code1._06random;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 杨春
 * @DATE 2022/8/7 15:24
 */
/*

    随机数
        方式一：Random
        方法：
        double nextDouble()     返回0.0到1.0之间的随机数
        nextInt()               在int范围内随即返回一个int值，可能有负数
        nextInt（int bound）      返回一个0到bound之间的随机数，但不包含bound

        方式二：Random的子类 --ThreadLocalRandom
        static ThreadLocalRandom current()  返回当前线程的 ThreadLocalRandom 。
        int nextInt(int origin,int bound)   返回开始值到结束值之间的随机数，前闭后开

        方式三：UUID
            static UUID randomUUID()  静态工厂检索一个类型4（伪随机生成）的UUID。

 */
public class RandomTest {
    public static void main(String[] args) {
        //创建Random对象
        Random random=new Random();
        System.out.println(random.nextInt());
        //生成随机数
        System.out.println(random.nextDouble());
        System.out.println(random.nextInt(1000));

        //获取创建随机数的对象
        ThreadLocalRandom local = ThreadLocalRandom.current();
        for (int i = 0; i <6 ; i++) {
            System.out.print(local.nextInt(1,32)+"\t");
        }

        //UUID
        UUID uuid=UUID.randomUUID();
        System.out.println("\n"+uuid);//e46ad7d6-9fb2-4f62-aa77-997a2e9584bd    唯一不重复字符串



    }
}

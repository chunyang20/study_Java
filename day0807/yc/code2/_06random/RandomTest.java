package cn.day0807.yc.code2._06random;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 杨春
 * @DATE 2022/8/8 11:29
 */
public class RandomTest {
    public static void main(String[] args) {
        /*
            随机数
                方式一：Random
         */
        Random random=new Random();
        //随机产生int类型的数字（包括负数）
        System.out.println(random.nextInt());
        //随机产生int类型的数字【0到边界范围）
        System.out.println(random.nextInt(1000));
        //double nextDouble() 返回0.0到1.0之间的随机数
        System.out.println(random.nextDouble());
        System.out.println("----------ThreadLocalRandom-----------");

        /*
            方式二：Random的子类   ThreadLocalRandom
                static ThreadLocalRandom current()  返回当前线程的 ThreadLocalRandom 。
                int nextInt(int origin, int bound) 返回origin（包含）到bound（排除）之间的随机数   [origin,bound)
        */
        //返回当前线程的 ThreadLocalRandom
        ThreadLocalRandom x=ThreadLocalRandom.current();
        System.out.println(x);

        //int nextInt(int origin, int bound) 返回origin（包含）到bound（排除）之间的随机数
        System.out.println(x.nextInt(1, 10)+" ");

        /*
            方式三  UUID
                static UUID randomUUID()  静态工厂检索一个类型4（伪随机生成）的UUID
         */
        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);       //唯一不重复 字符串
    }
}

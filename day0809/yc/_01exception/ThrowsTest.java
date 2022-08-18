package cn.day0809.yc._01exception;

/**
 * @author 杨春
 * @DATE 2022/8/9 11:08
 */
/*

    异常的处理方式2：
        抛出异常---：不处理异常
    抛出异常的语法：
        修饰符 返回值类型   方法名(形参列表)throws 异常类型,异常类型{
            //方法体
        }
    抛出异常和捕获异常的区别：
        1.捕获异常，当代码出现异常的时候，try结构后面的代码会正常的执行
        2.抛出异常，当代码发生异常的时候，代码就停止执行
 */
public class ThrowsTest {
    public static void main(String[] args) throws Exception/*NullPointerException,ArithmeticException*/{
        System.out.println("----");
        System.out.println("----");
        /*try {*/
            //有try捕获异常，后面的代码继续执行，没有try抛出异常，当代码发生异常的时候，代码就停止执行
            String s=null;
            System.out.println(s.charAt(0));
            System.out.println(1 / 0);
        /*
        }catch (Exception e){
            e.printStackTrace();
        }
        */


        System.out.println("----");
        System.out.println("----");

    }
}

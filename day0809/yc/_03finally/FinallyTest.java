package cn.day0809.yc._03finally;

/**
 * @author 杨春
 * @DATE 2022/8/9 14:06
 */
/*

    try{
        //可能发生异常的代码
    }catch(异常类型 变量名){
        //异常的处理方式
    }finally{
        //最终执行语句
    }

    finally:无论try里面代码是否报错，finally代码都要执行
    使用场景：写一些关闭流，关闭资源代码的语句

    面试题：请说说final    finally     finalize()区别

        共同点：没有  长得像
        不同点：    修饰符         代码块的关键字     垃圾回收器的方法

 */
public class FinallyTest {
    public static void main(String[] args) {


        System.out.println("------");
        System.out.println("------");
        try {
            System.out.println(1 / 1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //最终的
            System.out.println("------异常代码块finally-----");
        }
        System.out.println("------");
        System.out.println("------");

        System.out.println(num());
    }

    public static int num(){
        int n=0;

        try {
            System.out.println(1 / 0);
            n=10;
        }catch (Exception e){
            e.printStackTrace();
            n=20;
        }finally {
            //最终的
            System.out.println("异常代码块finally");
            n=30;
        }


        return n;
    }
}

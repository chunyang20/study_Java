package cn.day0809.yc._01exception;

import sun.plugin2.message.Message;

/**
 * @author 杨春
 * @DATE 2022/8/9 9:39
 */
/*
    程序一旦报错就停止运行

    java里面的异常处理方式
    方式一：捕获异常
    try{
        //可能发生异常的代码
    }catch(异常类型 变量名){
        //异常的处理方式
    }

    执行流程：
        1.可能发生异常的代码 报错  就去执行catch里面的内容
        2.可能发生异常的代码 没有报错    catch里面的内容不执行

    1.可能发生异常的代码
    2.异常类型  变量名--->可以写对应异常类型以及父类类型  ---可以捕获的异常类型
    3.异常的处理方式
        3.1前面三个月异常的处理方式
            e.printStackTrace();    //打印堆栈跟踪
        3.2 获取异常信息
            e.getMessage();
        3.3 记录日志
            Log4j


 */
public class ExceptionTest {
    public static void main(String[] args) {

        System.out.println("------");
        System.out.println("------");
        System.out.println("------");
        try {
            String s=null;
            System.out.println(s.charAt(0));    //NullPointerException
            //可能发生异常的代码
            System.out.println(1 / 0);
        //catch(异常类型  变量名)
        }catch (ArithmeticException e){
            e.printStackTrace();
            //异常的处理方式---写算数异常的处理方式
            System.out.println("上面除法报错了");
        }catch (NullPointerException e){
            //写空指针异常的处理代码
            e.printStackTrace();
        }




        /*
        try {
            //可能发生异常的代码
            System.out.println(1/0);    //ArithmeticException
        }catch (Exception e) {
            //getMessage()获取异常信息
            String message = e.getMessage();
            System.out.println(message);
        }
        */
        System.out.println("------");
        System.out.println("------");
        System.out.println("------");


    }


}

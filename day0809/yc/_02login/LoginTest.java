package cn.day0809.yc._02login;

import java.rmi.AlreadyBoundException;
import java.util.Scanner;

/**
 * @author 杨春
 * @DATE 2022/8/9 11:24
 */
/*
    主动抛出异常
        throw 异常对象

        一般抛出异常的时候要在方法后面加throws语句指定抛出的异常类型
        特殊情况：
            当抛出的异常类型时RuntimeException以及RuntimeException的子类，throws语句可以省略
 */
public class LoginTest {
    //系统预设置了几个账户---他们的密码都是123456
    static String[]arr={"root","admin","iKun"};
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=sc.next();
        System.out.println("请输入密码");
        String password=sc.next();

        LoginTest.login(username,password);


    }

    public static void login(String username,String password)throws Exception{
        String loginName="";
        //检查用户名
        for (String str:arr) {
            if (username.equals(str)){
                loginName=str;
            }
        }
        //如果loginName还是"" 说明用户名错误
        if (loginName.equals("")){
            /*
                System.out.println("用户名错误");
                return;
             */

            /*
                throw 异常对象
                主动的报错，后面的代码停止运行，把这个错误调给调用者处理
                public Exception(String message){
                    message:用来携带错误信息
                }
             */
            //throw new Exception;
            //特殊情况：当抛出的异常类型是RuntimeException以及RuntimeException的子类时throws语句可省略
            throw new RuntimeException("用户名错误，请重新输入");
        }
        if (!password.equals("123456")){
            //throw new RuntimeException("用户名错误，请重新输入");    //调用方法可以不写throws 异常
            throw new AlreadyBoundException("密码错误，请重新输入");
        }
    }

}

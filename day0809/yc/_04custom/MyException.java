package cn.day0809.yc._04custom;



import java.util.Scanner;

/**
 * @author 杨春
 * @DATE 2022/8/9 14:28
 */
/*
    已有的异常:非常庞大，但是还不能满足开发中自己的业务场景
    自定义异常


 */
public class MyException {
    //系统预设置了几个账户---他们的密码都是123456
    static String[]arr={"root","admin","iKun"};
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=sc.next();
        System.out.println("请输入密码");
        String password=sc.next();

        MyException.login(username,password);
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
            throw new LoginBusinessException("用户名错误，请重新输入");
        }
        if (!password.equals("123456")){
            throw new LoginBusinessException("密码错误，请重新输入");
        }
    }
}

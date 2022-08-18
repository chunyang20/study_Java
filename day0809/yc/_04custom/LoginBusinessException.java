package cn.day0809.yc._04custom;

/**
 * @author 杨春
 * @DATE 2022/8/9 14:37
 */
/*

    自己定义一个类 表示登录的业务异常
    1.自己定义一个类，一般这个类都是以Exception结束
    2.继承一个已知的异常类即可   RuntimeException更好，因为不用抛异常
    3.一般提供一个有参数的构造方法，内部调用父类有参的构造方法即可

 */
public class LoginBusinessException extends Exception{
    //无参数的构造方法一般只是报错
    public LoginBusinessException(){

    }
    //有参数的希望报错时携带一些报错信息
    public LoginBusinessException(String msg){
        super(msg);
    }
}

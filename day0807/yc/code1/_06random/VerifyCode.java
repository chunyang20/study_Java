package cn.day0807.yc.code1._06random;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 杨春
 * @DATE 2022/8/7 16:08
 */
/*
    验证码
        1.4-6位数字
	 	2.0-9 a-z  A-Z 组合的6位
	  1.准备一个验证码生成的数据集合
	  2.随机生成 数据集合范围内的一个索引

 */
public class VerifyCode {
    public static void main(String[] args) {
        System.out.println(getCode(6));
    }

    public static String getCode(int length){
        //准备一个验证码生成的数据集合
        String str="0123456789qwertyuiopasdfghjklzxcbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        //创建一个随机数生成对象
        ThreadLocalRandom current=ThreadLocalRandom.current();
        //用于去拼接字符串
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int index=current.nextInt(0,str.length());
            char c=str.charAt(index);
            sb.append(c);
        }
        return sb.toString();
    }
}

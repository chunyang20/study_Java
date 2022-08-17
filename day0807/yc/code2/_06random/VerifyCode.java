package cn.day0807.yc.code2._06random;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 杨春
 * @DATE 2022/8/8 11:50
 */
public class VerifyCode {
    public static void main(String[] args) {

        VerifyCode verifyCode=new VerifyCode();
        System.out.println(verifyCode.getCode(6));

    }

    public String getCode(int length){
        //1.准备一个验证码生成的数据集合
        String str="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        //创建一个随机数生成对象
        ThreadLocalRandom random=ThreadLocalRandom.current();
        //用于去拼接字符串
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < length; i++) {
            //随机生成 数据集合范围内的一个索引
            int index=random.nextInt(0,str.length());
            //根据随机出来的索引去取出对应的字符
            char c=str.charAt(index);
            //拼接验证码
            sb.append(c);

        }
        return sb.toString();
    }
}

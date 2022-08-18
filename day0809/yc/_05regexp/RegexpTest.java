package cn.day0809.yc._05regexp;

/**
 * @author 杨春
 * @DATE 2022/8/9 15:05
 */
/*

    正则表达式用来验证数据格式
    String类
        boolean matches(String regex)
            regex:正则表达式
 */
public class RegexpTest {
    public static void main(String[] args) {
        //需求：验证身份证号是否正确
        /*
            18位
            前17位全是数字
            最后一位可以是数字和X

         */
        String idCard="511525200201301054";
        System.out.println(idCard.matches("^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$"));
        String str="13032105896";
        boolean b=str.matches("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$");
        System.out.println(b);
        //需求：验证邮箱格式
        /*
            766500397@qq.com
         */

    }
}

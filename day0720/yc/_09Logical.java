package day0720.yc;
/*
*       逻辑运算:把多个比较的结果进行综合判断得到最终结果
*           &:      如果明天放假，天不下雨，去打篮球
*           |:      有真则真
*           !:      【非】取反
*           &&:     【逻辑与】符号需要同时判断左右都为true，结果才为true
*           ||:     【逻辑或】符号左边已经确定执行结果为true右边不执行，
*                                            false右边要执行。
* */
public class _09Logical {
    public static void main(String[] args) {
        int sc=80;
        System.out.println(sc>=60&sc<=100);//true       与
        sc=56;
        System.out.println(sc>=60&sc<=100);//false      与
        sc=120;
        System.out.println(sc>=60&sc<=100);//false      与
        System.out.println(sc>=100|sc<=50);//true       或
        System.out.println(!true);          //false      非
        System.out.println("******************");
        sc=85;
        //                  true        true    左边判断的结果为true，右边不执行（短路效果）
        System.out.println(sc>80 || sc++<=100); //true
        //                  false       true    左边判断的结果为true，右边不执行（短路效果）
        System.out.println(sc>90 || sc++<=100);//true,左边判定为false,右边可能为true，可能为false，所以右边要执行
        System.out.println(sc);                 //右边为真，自增
    }
}

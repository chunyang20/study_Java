package cn.day0806.yc._02enum;
/*
*       支付方式：
*           支付宝、微信、银联
*
* */
public class EnumTest {
    public static void main(String[] args) {
        PayServiceImpl impl=new PayServiceImpl();
        impl.pay(PayWay.ALI);
        impl.pay(PayWay.WECHAT);
        impl.pay(PayWay.YINLIAN);
        System.out.println(PayWay.ALI.hashCode());
    }
}

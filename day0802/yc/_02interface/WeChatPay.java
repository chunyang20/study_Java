package cn.day0802.yc._02interface;
/*
*       微信支付
*           类实现接口
*           语法：
*           public class 类名 implements 接口名字{
*           //覆写所有的抽象方法
*           }
* */
public class WeChatPay implements PayWay{
    @Override
    public void pay(String acc, double money, String person, String dis) {
        //调用微信的方法传输数据  发起扣款
        System.out.println(acc+"花费"+money+"从"+person+"购买了"+dis);
    }

    @Override
    public void query(String order) {

    }

    @Override
    public void refund(String order) {

    }
}

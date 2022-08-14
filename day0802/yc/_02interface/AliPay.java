package cn.day0802.yc._02interface;

public class AliPay implements PayWay{
    @Override
    public void pay(String acc, double money, String person, String dis) {
        System.out.println(acc+"花费"+money+"从"+person+"购买了"+dis);
        System.out.println("支付宝到账"+money);
    }

    @Override
    public void query(String order) {

    }

    @Override
    public void refund(String order) {

    }
}

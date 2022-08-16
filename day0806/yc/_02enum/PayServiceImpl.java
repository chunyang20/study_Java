package cn.day0806.yc._02enum;

public class PayServiceImpl implements IPayService{
    @Override
    public void pay(PayWay way) {
        switch (way){
            case ALI:
                //调用支付宝支付工具完成支付功能
                System.out.println("支付宝收款130元");
                break;
            case WECHAT:
                //调用微信支付工具完成支付功能
                System.out.println("微信收款99元");
                break;
            case YINLIAN:
                //调用银联支付工具完成支付功能
                System.out.println("银联收款299元");
                break;
            default:
                System.out.println("暂未开通其他服务");

        }
    }
}

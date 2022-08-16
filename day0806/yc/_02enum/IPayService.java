package cn.day0806.yc._02enum;

public interface IPayService {
    //真正的形式参数，需要收款人，支付用户，金额，支付方式
    void pay(PayWay way);
}

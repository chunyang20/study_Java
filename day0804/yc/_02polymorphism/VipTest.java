package cn.day0804.yc._02polymorphism;

public class VipTest {
    public static void main(String[] args) {

        Vip vip0=new Vip();
        vip0.privilege();

        Vip vip=new Vip2();
        vip.privilege();
        if (vip instanceof Vip1){
            Vip1 vip1 = (Vip1)vip;
            vip1.low();
        }else if (vip instanceof Vip2){
            Vip2 vip2 = (Vip2)vip;
            vip2.middle();
        }else if (vip instanceof Vip3){
            Vip3 vip3=(Vip3) vip;
            vip3.top();
        }
    }
}

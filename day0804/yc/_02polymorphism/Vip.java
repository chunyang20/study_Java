package cn.day0804.yc._02polymorphism;

public class Vip {
    public void privilege(){
        System.out.println("我有特权！");
    }
}
class Vip1 extends Vip{
    @Override
    public void privilege() {
        System.out.println("我是一般VIP");
    }
    public void low(){
        System.out.println("很low");
    }
}
class Vip2 extends Vip{
    @Override
    public void privilege() {
        System.out.println("我是中级VIP");
    }
    public void middle(){
        System.out.println("中等");
    }
}
class Vip3 extends Vip{
    @Override
    public void privilege() {
        System.out.println("我是高级VIP");
    }
    public void top(){
        System.out.println("高级");
    }
}

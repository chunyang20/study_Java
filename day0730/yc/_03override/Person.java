package day0730.yc._03override;

public class Person extends Animal{
    String name="小杨";
    //重写父类的move方法，重新定义逻辑

    @Override
    public void move() {
        System.out.println("滑板鞋，在这光滑的地上摩擦");
    }
    //子类方法的返回值类型必须和父类方法的返回值类型相同
    @Override
    public Person sleep() {
        return null;
    }
}

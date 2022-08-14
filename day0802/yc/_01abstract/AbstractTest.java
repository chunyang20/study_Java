package cn.day0802.yc._01abstract;

public class AbstractTest {
    public static void main(String[] args) {
        //抽象类不能创建对象
        //Graph graph=new Graph();
        Circle c1=new Circle();
        c1.setR(5);
        System.out.println(c1.getGirth());
        System.out.println(c1.getArea());
        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getGirth());
    }
}

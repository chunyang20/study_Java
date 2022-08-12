package day0730.yc._03override;

public class Snake extends Animal{
    //如果子类没有，再去找父类

    @Override
    public void move() {
        System.out.println("左右扭，趴着走。。。。");
    }
}

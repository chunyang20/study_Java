package day0730.yc._03override;
// 父类的私有属性和方法
public class Animal {
    String name="小李飞刀";
    int age;
    boolean sex;

    public void move(){
        System.out.println("移动ing");
    }
    public Animal sleep(){
        return null;
    }
}

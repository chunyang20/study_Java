package day0730.yc._02extends;
//父类--的公有属性和方法
public class Animal {
    protected String name;
    int age;
    boolean sex;
    public Animal(){

    }

    public Animal(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void move(){
        System.out.println("移动中");
    }
}

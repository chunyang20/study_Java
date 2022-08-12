package day0730.yc._04super;

public class Animal {
    String name="小李";
    int age;
    boolean sex;
    public Animal(){
        System.out.println("调用了无参构造方法");
    }
    public Animal(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("调用了有参构造方法");
    }

    public void move(){
        System.out.println("移动ing--------普通方法");
    }

    protected void print() {
        System.out.println("给我口水喝");
    }
}

package cn.day0804.yc._03polymorphism;

public class Person {
    /*public void feedDog(Hasky dog) {
        dog.eat();
    }

    public void feedDog(Teddy dog) {
        dog.eat();
    }

    public void feedDog(Tudog dog) {
        dog.eat();
    }
    如果有几万种狗，就需要写几万个方法喂狗，不可取
    */
    public void feedDog(Dog dog) {//屏蔽子类差异性。写一个父类类型，所有的子类对象都可以接收
        dog.eat();
    }
}

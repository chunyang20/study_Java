package cn.day0804.yc._03polymorphism;

public class DogTest {

    public static void main(String[] args) {
        //测试喂狗案例
        Hasky hasky = new Hasky();
        Tudog tudog = new Tudog();
        Teddy teddy = new Teddy();

        Person person = new Person();
        person.feedDog(hasky);
        person.feedDog(tudog);
        person.feedDog(teddy);
    }
}

package cn.day0804.yc._03polymorphism;

public class Dog {
    public void eat() {
        System.out.println("吃...");
    }
}

class Hasky extends Dog {
    @Override
    public void eat() {
        System.out.println("狗粮..");
    }
}

class Teddy extends Dog {
    @Override
    public void eat() {
        System.out.println("吃天吃地吃空气");
    }
}


class Tudog extends Dog {
    @Override
    public void eat() {
        System.out.println("啃骨头。。。");
    }
}


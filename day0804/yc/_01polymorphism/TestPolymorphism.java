package cn.day0804.yc._01polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal animal=new Person();
        animal.eat();
        Animal animal2=new Pig();
        animal2.eat();
        //把animal向下强制转型
        if (animal instanceof Person){                      //判断animal的类型是不是人类
            Person person=(Person)animal;                   //如果是，将animal的类型向下强制转化成人类
            person.coding();                                //调用人类特有的方法
        }else if (animal instanceof Pig){
            Pig pig=(Pig) animal;
            pig.gongBaiCai();
        }


        System.out.println(animal.age);  //成员变量没有多态  所以输出1

    }


}

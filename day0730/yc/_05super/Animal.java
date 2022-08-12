package day0730.yc._05super;

public class Animal {
    public Animal(){
        System.out.println("调用了父类无参数构造方法");
    }
    public Animal(String name){
        System.out.println("调用了父类有参数构造方法"+"\t"+name);
    }

}

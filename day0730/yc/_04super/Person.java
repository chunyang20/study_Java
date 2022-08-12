package day0730.yc._04super;
/*
*       super：就是一个关键字
*           1.在子类里面使用父类的属性和方法【super代表代表父类对象，但是不持有父类对象的地址值】
*               但是不持有父类对象的地址值，本质上就不是一个对象，只是看成父类对象，不能直接打印
*
* */
public class Person extends Animal{
    String name="小李飞刀";
    public void show(String name){
        System.out.println(name);                   //小李他ma的飞刀
        System.out.println(this.name);              //小李飞刀
        System.out.println(this);                   //this持有当前对象的地址值
        //Animal animal=new Animal();               正常调方法通过对象调
        //animal.print();

        //在子类里面使用父类的方法
        super.print();                               //给我口水喝
        //使用父类成员的属性
        //System.out.println(animal.name);              //通过super可以直接调父类的方法和属性，不用创建对象（前提他们是继承关系）
        System.out.println(super.name);              //小李
    }

}



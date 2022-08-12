package day0730.yc._05super;
/*
*       super作用2
*           在子类的构造方法里面调用父类的构造方法
*           注意事项：super调用父类构造方法的时候，只能写在第一句
*           this和super能不能一起使用？【不能】
* */
public class Student extends Animal{
    String name;
    String phone;
    String email;
    public Student(){
        //super();          //隐藏的  调用父类的无参数构造方法
        //每个子类的构造方法（不管有参无参）如果没有显示的调用父类的构造方法
        //隐式的调用父类的无参数构造方法
        super("测试");        //调用父类有参的构造方法
        System.out.println("调用了子类的无参构造方法");


    }
    public Student(String name){
        //super();                //默认有super（）调用父类的构造方法
        super("测试父类有参");                //也可以自己写调用父类有参的构造方法
        this.name=name;
    }
    public Student(String name,String phone,String email){
        //super();                    //隐式的调用父类无参的构造方法

        this.name=name;
        this.phone=phone;
        this.email=email;
    }




}

package cn.day0806.yc._03oop;

public class Test {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("无极剑圣");

        Student stu2=new Student("无极剑圣",0,false,null );
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu1.equals(stu2));

        /*
        *   多态
        *       1.向上转型
        *           使用父类接收子类对象；使用接口接收实现类对象
        *           缺点：在编码的时候只能去使用父类的或者接口的属性和方法
        *           使用场景：多是用于方法的形参和实参
        *       2.向下转型
        *           为了使用子类或者实现类特有的属性和方法
        *           使用场景：多是用于方法的形参和实参
        *
        *           service(ServletRequest req){
        *               HttpServletRequest
        *           }
        *           类型的判断：instanceof
        *
        * */
        //使用父类接收子类对象
        Student stu=new User();
        //使用接口接收实现类对象
        Cat cat=new Tomcat();

        if (stu instanceof User){
            User u=(User) stu;
        }
    }
}

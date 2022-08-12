package day0730.yc._05super;

public class SuperTest {
    public static void main(String[] args) {
        Animal a=new Animal();
        System.out.println(a);
        Student s1=new Student();
        Student s2=new Student("孙飞燕");
        System.out.println(s2.name);
        Student s3=new Student("王天霸","130","766@qq.com");
        System.out.println("姓名："+s3.name+"，电话："+s3.phone+"，邮箱："+s3.email);
        System.out.println(s2);
        System.out.println(s1);
    }
}

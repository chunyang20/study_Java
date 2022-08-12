package day0729.yc;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("小南");
        s1.setAge(24);
        s1.setClasses("Japan");
        s1.setId("1001");
        s1.setPhone("820-820-8820");
        s1.setSex("女");
        System.out.println(s1.getName());
        System.out.println(s1.getSex());
        System.out.println(s1.getAge());
        System.out.println(s1.getClasses());
        System.out.println(s1.getId());
    }
}

package day0729.yc._04this;
/*
*       this是一个对象，this所在的方法被哪个对象调用，this就是哪个对象
*
* */
public class ThisTest {
    public static void main(String[] args) {
        User user=new User();
        System.out.println("测试案例里面的user---"+user);
        user.setName("杨春");
        user.setPassword("655556");
        System.out.println(user.getName());
        System.out.println(user.getPassword());
    }
}

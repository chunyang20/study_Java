package day0729.yc;

public class AccountTest {
    public static void main(String[] args) {
        Account a=new Account();
        a.setName("杨春");
        a.setNo("1000001");
        a.setPassword("123456");
        a.setMoney(5641.0);
        System.out.println(a.getName());
        System.out.println(a.getNo());
        System.out.println(a.getPassword());
        System.out.println(a.getMoney());
    }
}

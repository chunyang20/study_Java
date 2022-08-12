package day0720.yc;

public class _10Logical {
    public static void main(String[] args) {
        int sc=80;
        System.out.println(sc>80&sc<=100);      //false
        System.out.println(sc>80&&sc<=100);     //false

        System.out.println(sc>80 &&sc<=100);    //false 左边已经为false右边不执行
        System.out.println(sc>80 && sc++ <=100);    //证明右边没执行
        System.out.println(sc);
    }
}

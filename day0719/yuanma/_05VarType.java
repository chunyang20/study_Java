package day0719.yuanma;
/*
*       2022-7-19
*
* */
public class _05VarType {
    static byte by;
    static short s;
    static int a;
    static long l;

    static float f;
    static double d;
    static char c;
    static boolean bool;

    static  String str;
    static String name="小杨睡不醒";

    public static void main(String[] args) {
        int b=128;
        System.out.println(by);
        System.out.println(s);
        System.out.println(a);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(str);
        System.out.println(name);
        System.out.println(b);
        double yy=1.0;
        double cc=3.0;
        double bb=yy/cc;
        float aa=(float) (yy/cc);                   //double转float
        System.out.println(bb);
        System.out.println(aa);

    }

}

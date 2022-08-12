package day0720.yc;
/*
* 赋值运算
* +=    (数字运算，字符串拼接)
* -=
* *=
* /=
*
*
* */
public class _03Assignment {
    public static void main(String[] args) {
        int i=10;
        System.out.println(i+=10);
        System.out.println(i-=10);
        System.out.println(i*=10);
        System.out.println(i/=10);
        System.out.println(i%=10);

        String s1="你爱我";
        String s2=",我爱你，蜜雪冰城甜蜜蜜";
        System.out.println(s1+=s2);
    }
}

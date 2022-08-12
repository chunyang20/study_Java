package day0720.yc;
/*
*       自增自减运算：
*       ++  --      步长为1
*       ++X   X先自增 在赋值
*       X++   X先赋值 在自增
* */
public class _02Test {
    public static void main(String[] args) {
        int x=3;
        int y=x++ +x++ +x++;
        int z=++x + ++x + ++x;
        System.out.println(y);
        System.out.println(z);
    }
}

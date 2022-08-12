package day0720.yc;

public class _08BitOperation {
    public static void main(String[] args) {
        /*
        *       6->     00000110
        *       4->     00000100
        * -------------------------
        *               00000100        与，同真则真
        *               00000110        或，有真则真
        *               00000001        >>,右移两位
        *               00011000        <<,左移两位
        * */
        System.out.println(6&4);
        System.out.println(6|4);
        System.out.println(6>>2);
        System.out.println(6<<2);
    }
}

package day0722.yc;

public class _08for {
    public static void main(String[] args) {
        for (int i=1;i++<=15;i+=2){
            System.out.println(i++);
        }
    }
    /*                      1
    *               i=1     i++<=15     i=2     打2
    *                       5
    *       i=3     i=5     i++<=15     i=6     打6
    *                       9
    *       i=7     i=9     i++<=15     i=10    打10
    *                       13
    *       i=11    i=13    i++<=15     i=14    打14
    *                       17
    *       i=15    i=17    i++<=15否    跳出不打
    * */
}

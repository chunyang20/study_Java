package day0723.yc;
/*
*   计算20-50里面前4个3的倍数的数字
*
* */
public class _05Control {
    public static void main(String[] args) {
//        int count=0;
//        for (int i=20;i<=50;i++){
//            if (i%3==0){
//                count++;
//                System.out.println(i);
//            }
//            if (count==4){
//                break;
//                //return;
//            }
//        }
        int count1=0;
        for (int i=50;i>=20;i--){
            if (i%3==0) {
                System.out.println(i);
                count1++;
            }
            if (count1==4){
                break;
            }
        }
        System.out.println(count1);
    }
}

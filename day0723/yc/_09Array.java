package day0723.yc;
/*
* 数组以及前面知识的综合运用。
    1.已知一个数组为 int arrn={62,56,5,1,8,54,6,4,9,65}—求奇数以及偶数和?数组的静态声明、数组的遍历、比较运算，%
*   2.已知一个数组为 int anr={62,56,5,1,8,54,6,4,9,65}求奇数以及偶数个数?数组的静态声明、数组的遍历、比较运算，%
*   3.已知一个数组为 int arc={62,56,5,1,8,54,6,4,9,65]找出5第一次出现的索引位置?数组的静态声明、数组的遍历、比较运算
    4.已知一个数组为 jint anc={62,56,5,1,8,54,6,4,9,5,65]}找出5最后一次出现的索引位置?数组的静态声明、数组的遍历、比较运算

*
* */
public class _09Array {
    public static void main(String[] args) {
        int arrn[]={62,56,5,1,8,54,6,4,9,65};
        int countOdd=0;
        int countEven=0;
        int odd=0;
        int evensum=0;
        for (int i=0;i<arrn.length;i++){
            System.out.println(arrn[i]);
            if(arrn[i]%2==0){
                evensum+=arrn[i];
                countOdd++;
            }
            else {
                odd+=arrn[i];
                countEven++;
            }
        }
        System.out.println("奇数的和："+odd);
        System.out.println("奇数的个数"+countOdd);
        System.out.println("偶数的和:"+evensum);
        System.out.println("偶数的个数"+countEven);
    }
}

package day0721.yc;
/**       1. 输出 1-10的所有的数。
          2. 求出 1-10的所有偶数的和。
          3. 求出1-10中2的倍数的数字和个数。
*/
public class _while02 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        int evenSum=0;
        int evenCount=0;
        while (i<=10){
            System.out.println(i);
            sum+=i;
            i++;
            if(i%2==0){
                evenSum+=i;
                evenCount++;
            }
        }
        System.out.println("1-10所有数的和"+sum);
        System.out.println("1-10所有偶数的和："+evenSum);
        System.out.println("2的倍数的个数："+evenCount);
        System.out.println("_while02.main");
    }
}

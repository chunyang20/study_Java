package day0723.yc;
/*
*
* 打印1-200所有6的倍数的前七个
* */
public class _09ForControl {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=200;i++){

            if (i%6==0){
                System.out.println(i);
                count++;
            }
            if (count==7){
                break;
            }

        }
        System.out.println("-----------------------------------");
        //求1—100之间不能被3整除的数之和大于(或等于)100的第一个数字 continue/break
        int sum=0;
        for (int i=1;i<=100;i++){
            if (i%3!=0){
                sum+=i;
                System.out.print(i+"\t");
                System.out.println("\t"+sum);
                if (sum>=100){
                    System.out.println("\n"+i);
                    break;
                }
             }
        }
        System.out.println(sum);
    }
}

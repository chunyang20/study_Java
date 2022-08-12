package day0723.yc;

public class DoubleFor {
    public static void main(String[] args) {
        /*
        * 打印*****
        *    *****
        *    *****
        *    *****
        *
        * */
        //打印解决多少行的问题
        for (int i=1;i<=5;i++){
            //每行打印多少个
            for (int j=1;j<=5;j++) {
                System.out.print("*");
            }
            //每行打印结束 换行
            System.out.println();
        }
        //写一个循环，每行打印多少个的问题

    }
}

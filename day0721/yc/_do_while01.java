package day0721.yc;
// 请打印10句，我爱Java，Java让我快乐！
// 声明一个int类型变量count2表示次数，赋值1

public class _do_while01 {
    public static void main(String[] args) {
        int count=1;
        do {
            System.out.println("我爱Java，Java让我快乐！");
            count++;
        }while (count<=10);

        //count=1           打1次     count=2     2<=10
        //                  打2次     count=3     3<=10
        //                  打3次     count=4     4<=10
        //                    .         .           .
        //                    .         .           .
        //                  打10次    count=11    11<=10  不成立

    }
}

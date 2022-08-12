package day0723.yc;
/*
* 循环控制语句
* break;    结束当前循环，把break所在的循环提前结束
* continue;
* return;结束当前方法，一般不在return后面添加语句
* */
public class _04Control {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            System.out.println("外层:----------"+i);
            for (int j=1;j<10;j++){
                if(j==2){
                    //return;   结束当前方法
                    //break;      //结束当前循环
                    continue;   //跳过本次循环
                }
                System.out.println("内层j=="+j);
            }
        }
        System.out.println("程序运行结束");
    }
}

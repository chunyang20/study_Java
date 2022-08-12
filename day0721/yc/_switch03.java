package day0721.yc;
/*
 * 请打印输出月份所属于的季节，
 * 	3、4、5 春
 * 	6、7、8 夏
 * 	9、10、11 秋
 * 	12、1、2 冬
 */

import java.util.Random;

public class _switch03 {
    public static void main(String[] args) {
        Random random=new Random();                 //创建随机数
        int month=random.nextInt(12)+1;       //随机数赋值为int变量 默认下标为0，所以+1，bound是范围
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println(month+"月是春天！");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(month+"月是夏天！");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(month+"月是秋天！");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(month+"月是冬天！！");
                break;
            default:
                break;
        }
    }
}

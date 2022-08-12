package day0721.yc;

import java.util.Calendar;

/*
       请设计一个一周工作计划
       周一：好好学习
       周二：看片学习
       周三：实践学习
       周四：吃药补补身体！
       周五：爬山锻炼身体！
       周六：休息，给身体放个假
       周日：总结一周所得！
*/
public class _switch01 {
    public static void main(String[] args) {
        String[]weekdays={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        Calendar calendar=Calendar.getInstance();
        System.out.println(weekdays[calendar.get(Calendar.DAY_OF_WEEK)-2]);
        switch (weekdays[calendar.get(Calendar.DAY_OF_WEEK)-2]){
            case "星期一":
                System.out.println("好好学习");
                break;
            case "星期二":
                System.out.println("看片学习");
                break;
            case "星期三":
                System.out.println("实践学习");
                break;
            case "星期四":
                System.out.println("吃药补补身体！");
                break;
            case "星期五":
                System.out.println("爬山锻炼身体！");
                break;
            case "星期六":
                System.out.println("休息，给身体放个假");
                break;
            case "星期日":
                System.out.println("总结一周所得！");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}

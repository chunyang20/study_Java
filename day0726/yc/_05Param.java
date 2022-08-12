package day0726.yc;
/*
*       可变参数本质就是数组
*           1.一个方法只能有一个可变参数，并且只能写在形参列表最后一位
* */
public class _05Param {
    public static void main(String[] args) {
        System.out.println(_05Param.add());
        System.out.println(_05Param.add(1,2,3,4,5));
        System.out.println(_05Param.add(10));
    }
    /*求多个数的和方法，int ...
    传入实参的时候，可以选择任意多个int类型的参数
     */
    public static int add(int ...nums){
        int sum=0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
    //1.一个方法只能有一个可变参数，并且只能写在形参列表最后一位
    public static void add(boolean b,int ... nums){

    }

    //一下写法虽然不报错，但是意义不大,因为可变参数可以包含前面的b
    public static void add(boolean a,int b,int ...nums){

    }
}

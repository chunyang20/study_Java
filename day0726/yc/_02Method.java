package day0726.yc;
/*
*
*       返回值类型：
*       1.void         --->代表没有返回值
*       2.数据类型      ----->
*           2.1可以是学过的任意数据类型【包括数组】
*           2.2方法执行以后返回一个什么类型的结果
*           2.3如果方法的返回值类型不是void，方法内部必须要有一个return返回数据的语句
* */
public class _02Method {
    public static void main(String[] args) {
        //使用一个变量接收方法的返回值，变量的数据类型一般和方法的返回值类型对应的
        int a=_02Method.add(500,20);
        System.out.println(a);
        int b=_02Method.add(a,65);
        System.out.println(b);
        //作为参数传递
        System.out.println(_02Method.add(_02Method.add(500,20),65));
    }
    /*
    *       返回值类型：
    *           int:add这个方法内部功能执行结束以后，返回一个int数据【只是做类型的限制】
    * */
    public static int add(int a,int b){
        //返回值类型int,计算a和b的和
        return a+b;
    }
}

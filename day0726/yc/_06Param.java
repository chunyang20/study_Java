package day0726.yc;
/*
*
*       值传递和引用传递的问题：
*           1.在调用方法的时候，基本数据类型传递的是值本身
*           2.引用数据类型，传递的是地址值【引用传递】
*
* */
public class _06Param {
    public static void main(String[] args) {
        int n=10;
        _06Param.change(n);
        System.out.println(n);          //值传递
        //引用传递
        int arr[]={9,8,7,6};
        change(arr);
        for (int a:arr) {
            System.out.print(a+"\t");
        }
    }

    public static void change(int a){
        a=20;
        //System.out.println(a);


    }

    public static void change(int[] a){
        a[0]=11;
    }
}

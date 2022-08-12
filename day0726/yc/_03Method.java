package day0726.yc;

public class _03Method {
    public static void main(String[] args) {
        int max = _03Method.getMax(5, 3);   //Ctrl+alt+V自动创建变量类型，变量名接收

        System.out.println(_03Method.getMin(4,5,6));


    }
    public static int getMax(int a,int b){
        return Math.max(a, b);
    }
    public static int getMin(int a,int b,int c){
        if (a<b){
            return a<c?a:c;
        }else {
            return b<c?b:c;
        }

    }
}

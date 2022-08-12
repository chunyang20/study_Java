package day0726.yc;
/*
*   方法重载（overload）
*
* */
public class _04Method {
    public static void main(String[] args) {
        System.out.println(_04Method.getMax(10,20));// getMax(int a,int b)
        System.out.println(_04Method.getMax(10,205,30));
        //getMax(int a, int b,int c)l

    }
    public static int getMax(int a,int b){
        return Math.max(a, b);
    }
    public static int getMax( int a,int b,int c){
        if(a>b){
            return Math.max(a, c);
        }else {
            return Math.max(b, c);
        }
    }

}

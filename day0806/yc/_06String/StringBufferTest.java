package cn.day0806.yc._06String;
/*

        String --不可变
        StringBuffer--可变的字符串【线程安全】
        StringBuilder(String str)   构造一个初始化为指定字符串内容的字符缓冲区

        常用方法：拼接字符串
            StringBuffer  append(int i)     将int参数的字符串表示附加到此序列

        结论：
            以后在工作中如果有遇到大量拼接字符串情况    要使用StringBuffer或者StringBuilder
            String类拼接字符串，会频繁创建对象，时间和内存的开销都比较大



 */
public class StringBufferTest {
    public static void main(String[] args) {
        String str="ABC";
        String str2=str+"DEF";
        //计算代码的运行时间
//        long start1=System.currentTimeMillis();
//        for (int i=0;i<100000;i++){
//            str2=str+i;
//        }
//        System.out.println(System.currentTimeMillis()-start1);

        StringBuffer sb=new StringBuffer("ABC");

        long start2=System.currentTimeMillis();

        for (int i = 0; i <100000 ; i++) {
            //追加字符串
            sb.append(i);

        }
        System.out.println(System.currentTimeMillis()-start2);
    }
}

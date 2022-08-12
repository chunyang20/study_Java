package day05;

public class _02Hw {
	public static void main(String[] args) {
		//1.求出2个int变量中的最大值，并且打印出来。int a = 1; int b = 3;。
		int a = 1;
		int b = 3;
		System.out.println(a>=b?a:b);
		//if--else
		if(a>=b){
			System.out.println(a);
		}else{
			System.out.println(b);	
		}
		/*
		 * 2.判断一个int变量i = 2,是否是3的倍数,如果是打印i是3的倍数，如果不是打印i不是3的倍数
		 * 
		 */
		int i=57;
		
		String str=i%3==0 ? i+"是3的倍数" : i+"不是3的倍数"; 
		
		if(i%3==0){
			System.out.println(i+"是3的倍数");
		}else {
			System.out.println( i+"不是3的倍数");
		}
		
		/*
		 * 3.小明java 考试成绩是int score = 99，按等级分A 、B、C、D、E，请判断成绩所在范围，并且打印输出不同的等级：
			90~100 A等            
			80-89 B等
			70-79 C等
			60-69 D等
			60以下 E等。
		  
		 */
		int score = 70;
		if(score>=90 && score<=100 ){
			System.out.println("A等");
		}else if(score>=80 && score<=89 ){
			System.out.println("B等");
			
		}else if(score>=70 && score<=79 ){
			System.out.println("C等");
		}else if(score>=60 && score<=69 ){
			System.out.println("D等");      //① C等  
			
		}else if(score<60 ){
			System.out.println("E等");
		}else {
			System.out.println("牛上天了");
		}
		
		
		
	}
}

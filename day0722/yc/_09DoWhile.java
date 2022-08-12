package day05;
/**
 * 语法：[了解]
 * 	do{
 *		//循环体 
 * 	}while(boolean);
 * 
 * 	特点：先执行一次do里面的循环体
 * 
 * 	1.打印1-10之间的数字。使用do...while
 * 
 */
public class _09DoWhile {
	public static void main(String[] args) {
		//1.打印1-10之间的数字。使用do...while
		int i=1;
		
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
		
	}
}

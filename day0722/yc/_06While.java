package day05;

/*
 * 让一段代码重复执行
 * 
 * while的基本用法：
 * 		while(①boolean){
 * 			//②功能语句
 * 		}
 * 		
 * 1.while的执行流程【非常重要】
 * 	第一次循环： ①--->true--->②
 * 	第二次循环： ①--->true--->②
 * 	第三次循环： ①--->true--->②
 * 	...
 * 	第n次循环： ①--->true--->②
 *	任何一次判断为--->false 结束循环  
 * 
 */


public class _06While {
	public static void main(String[] args) {
		//死循环--判断的条件 永远都不会为false 程序会一直执行下去
		while(true){
			System.out.println("你爱我，我爱你，蜜雪冰城甜蜜蜜");
		}
		//死循环后面的代码 永远都不能执行到
		//System.out.println("-------------------");
	}
}

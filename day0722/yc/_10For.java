package day05;
/**
 * 目标：
 * 	1.for循环的语法结构-【熟练的默写】
 * 		for(①初始化语句; ②判断语句 ; ③循环后执行语句){
 * 			//④循环功能体
 * 		}
 * 	2.for循环的执行流程步骤
 * 		第一次循环：①--->②--->true--->④--->③	
 * 		第二次循环：②--->true--->④--->③
 * 		第三次循环：②--->true--->④--->③
 * 			...
 * 		第n次循环：②--->true--->④--->③
 * 		直到：②--->false--->终止循环
 * 
 * 
 * 	for(int i=1;i++<=15;i+=2){
 * 		System.out.println(i++);
 * 	}
 * 
 * 
 *  分析上面的代码：
 *  	1.输出哪些数字？
 *  	2.循环多少次？
 *  	3.判断多少次？
 *  	4.最终i的值为多少？	
 * 	
 * 
 *  应用：
 *  	1.循环打印1-10的数字
 *  	2.找出1-10之间的偶数
 *  	3.计算1-10的和
 *  	4.计算1-10的偶数和
 *  	5.统计1-10的偶数的个数
 * 
 * 
 * 
 * 
 * 
 */
public class _10For {
	
	public static void main(String[] args) {
		//while循环版本的 1-10的数字
		/*	int i=1;
			while(i<=10){
				System.out.println(i);
				i++;
			}
		*/
		/*
		 * 改造为 for版本
		 * for(①初始化语句; ②判断语句 ; ③循环后执行语句){
		 * 			//④循环功能体
		 *	}
		 */
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		
		/*
		 *  for(int i=1;i++<=15;i+=2){
		 * 		System.out.println(i++);
		 * 	}
		 * 			  	判断		判断后i   打印		打印后i	循环后语句i
		 * 	第一次循环：       1		  2      2 		  3			5
		 * 	第二次循环：	5		  6		 6		  7			9
		 * 	第三次循环：	9		 10		 10		  11		13
		 * 	第四次循环：	13		 14		 14		  15		17
		 * 	第五次循环	 	17		 18 		
		 * 
		 * 分析上面的代码：
		 *  	1.输出哪些数字？  2 6 10 14
		 *  	2.循环多少次？	 4次	
		 *  	3.判断多少次？    5次
		 *  	4.最终i的值为多少？ 18	
		 */
		int i=1;
		for(;i++<=15;i+=2){
			 System.out.println(i++);
		}
		
		System.out.println(i);//18
		
		
		
		
		
		
		
		
		
		
	}
}

package day05;

public class _01Test {
	public static void main(String[] args) {
		/*运算符：
		 * 	自增、自减运算： ++ 、 --
		 * 		对于一个变量的操作，不能对常量操作
		 */
		int i=5;
		System.out.println(i++);//i++ 这个表达式就是i变量自增前的值  ，i本身要增长1
		System.out.println(++i);//++i 这个表达式i自增后的值 -->7
		/*
		 * 赋值运算
		 * 	+= -= *=  /=  %=
		 * 	+=（数学运算，字符串拼接）
		 */
		System.out.println(i+=7);//14
		/*比较运算
		 *  > < >= <= == !=
		 * 
		 */
		/*
		 * 三目运算
		 * 	x?y:z
		 * 	x：boolean值
		 * 	y：当x的值为true 表达式的值为y
		 * 	z：当x的值为false 表达式的值为z
		 */
		System.out.println(i>=15?"下半月":"上半月");
		/*
		 * 逻辑运算：
		 * 	&：与，符号两边的判断结果都为true的时候，整个表达式的结果为true[并且-都要为true]
		 * 	|：或，符号两边的判断的结果只要有一个为true，整个表达式的结果true[或者-只要有一个true]
		 *  ！：非，取反
		 *  &&：和&的结果一致，具有短路效果
		 *  ||：和|的结果一致，具有短路效果
		 * 
		 */
		System.out.println(i>=0&&i++<=20);
		System.out.println(i);
		//                 false
		System.out.println(i>=16 && i++<=20);
		System.out.println(i);
		//                 false    
		System.out.println(i>=16 || i++<=20);
		System.out.println(i);
		//                 true
		System.out.println(i>=16 || i++<=20);
		System.out.println(i);
		
		/*
		 * if-判断：
		 * 	单分支结构：
		 * 		if(boolean){
		 * 			//功能语句
		 * 		}
		 * 	效果：当判断的结果为true，就执行里面的功能语句，false就不执行
		 * 
		 * 	双分支结构
		 * 		if(boolean){
		 * 			//功能语句1
		 * 		}else{
		 * 			//功能语句2 
		 * 		}
		 * 	效果：当判断的结果为true，执行功能语句1，判断结果为false，执行功能语句2	
		 * 
		 * 	多分支结构：
		 * 		if(boolean){
		 * 			//功能语句1
		 * 		}else if(boolean){
		 * 			//功能语句2 
		 * 		}else if(boolean){
		 * 			//功能语句3 
		 * 		}else if(boolean){
		 * 			//功能语句4 
		 * 		}else if(boolean){
		 * 			//功能语句5 
		 * 		}else{
		 * 			//当上面的所有的条件不满足的时候，执行此处的功能语句
		 * 		}
		 * 
		 * 
		 * 
		 */
			
	}
	
	
	
}

package day05;
/*
 
 swtich选择结构:
		switch(变量){
			case 值1:
				功能语句1
				功能语句2...
				break;
			case 值2:
				功能语句1
				功能语句2...
				break;
			case 值3:
				功能语句1
				功能语句2...
				break;
							
			default:// 相当于条件语句中else，所有的case匹配不上执行default
				default语句
				break;
		}
 	
 	变量：byte、short 、int、char 、String（JDK1.7） 、枚举类型（JDK1.5）
 	值1、值2、值3...: 写变量可能的值
 	switch：只是适用于有固定的取值的情况
 	
 	执行的流程：
 		运行以后,使用变量和case 语句后面的值 进行匹配，匹配成功，执行内部的功能语句、
 		如果都匹配不上执行default 内部的功能语句
 	
 	
 */

public class _03Switch {
	public static void main(String[] args) {
		String week="星期五";
		switch(week){
			case "星期一":// 相当于 week=="星期一"
				System.out.println("敲代码");
				break;
			case "星期二":// 相当于 week=="星期一"
				System.out.println("学习Java");
				break;
			case "星期三":// 相当于 week=="星期一"
				System.out.println("约女朋友看电影");
				break;
			case "星期四":// 相当于 week=="星期一"
				System.out.println("九眼桥，捡...");
				break;
			case "星期五":// 相当于 week=="星期一"
				System.out.println("洗脚，金足印象");
				break;
			case "星期六":// 相当于 week=="星期一"
				System.out.println("孤身走暗巷");
				break;
			case "星期日":// 相当于 week=="星期一"
				System.out.println("休息，峡谷一日游");
				break;
			default:// 相当于条件语句中else，所有的case匹配不上执行default
				System.out.println("哥文滚........");
				//break;	
		}
	}
}

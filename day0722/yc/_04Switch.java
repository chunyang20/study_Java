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
 	switch：只是适用于有固定的取值的情况，星期  月份  季节   性别  星座  支付方式...
 		以后switch一般都是和枚举一起使用【讲枚举的时候详细说】
 	
 	执行的流程：
 		运行以后,使用变量和case 语句后面的值 进行匹配，匹配成功，执行内部的功能语句、
 		如果都匹配不上执行default 内部的功能语句
 	
 	
 	研究：break的作用
 		break结束、中断当前的选择结构的作用，
 		如果没有break 程序会继续执行，直到遇到break或者全部执行结束【最后一个匹配语句】
 		
 	接下来的代码，非主流的代码，正常开发不这么用，此处只是去演示break的效果
 	
 */

public class _04Switch {
	public static void main(String[] args) {
		String week="星期八";
		switch(week){
		
			default:// 相当于条件语句中else，所有的case匹配不上执行default
				System.out.println("哥文滚........");
				
			case "星期一":
				System.out.println("敲代码");
				break;
			case "星期二":
				System.out.println("学习Java");
				//break;
			case "星期三":
				System.out.println("约女朋友看电影");
				break;
			case "星期四":
				System.out.println("九眼桥，捡...");
			case "星期五":
				System.out.println("洗脚，金足印象");
			case "星期六":
				System.out.println("孤身走暗巷");
				
			case "星期日":
				System.out.println("休息，峡谷一日游");
			
				
		}
	}
}

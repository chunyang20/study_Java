package day0725.yc;
/**
 *	方法（Method）:
 * 		1.方法和主方法平级的存在【主方法也是方法，有点特殊】
 * 		2.方法的语法：
 * 		修饰符  返回值类型 方法名(形参列表){
 * 			//方法体
 * 		}
 * 		
 * 		修饰符号：可以省略
 * 			public：公共的--权限
 * 			static：静态的--方法的调用方法不一样
 * 		 返回值类型：
 * 			1.void--没有返回值
 * 			2.数据类型
 * 		方法名：
 * 			由用户自己去定义一个名字，前期最好不要重名
 * 
 * 		形参列表：
 * 			当方法内部的功能实现的时候 部分值不能固定写死的时候，使用形参列表
 * 
 * 	方法的调用：[程序运行的主入口是main，也只是会运行主方法里面写的内容]
 * 		普通方法和主方法是平级的存在，不在主方法里面调用普通方法，普通是不会运行的
 * 		
 * 		1.方法名();[用的非常少] 调用者和被调用的方法，在同一个类里面，两者要么都被static修饰，要么都没有被static修饰
 * 		2.类名.方法名();[用的比较多]	被调用的方法必须有static修饰	
 * 			类名：被调用的方法所在类的类名
 * 		3.对象.方法名();[用的非常多] 被调用的方法没有static修饰【面向对象的时候研究如何创建对象】
 * 
 * 
 * 形参列表：
 * 	  根据功能需求而定
 * 	  数据类型 变量名,数据类型 变量名,....
 * 	 作用：用来去解决，方法在定义的时候参数固定写死的情况	，
 * 		用来去约束方法的调用者 在使用方法的时候传入的实际的数据
 * 
 * 
 */
public class _08Method {
	
	
	public static void main(String[] args) {
		//
		_08Method.a1(true,1,'汗');
		_08Method.a3(3.14,2,"fasfdas");
		char[] ar={'A','B','e'};
		//调用形参为数组的时候 传入参数的方式
		_08Method.a4('a',ar);
	}
	//约束使用者传入一个 boolean int  char
	public static void a1(boolean b,int c,char o){
		
	}
	public static void a3(double d,int c,String str){
		
	}
	
	public static void a4(char c,char[] arr){
		
	}
	
	
	
	
}

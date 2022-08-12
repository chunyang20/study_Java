package day0725.yc;
/**
 		1. 统计一个字符在字符数组中第一次出现的下标（直接输出）
		2. 统计一个字符在字符数组中出现的次数（直接输出）
		3. 已知这样的整型数组 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22}; 计算出其中的奇数和以及偶数和
		4. 现在有数组 double[] scores = {11, 34, 76, 77, 88, 99, 58, 97, 56};统计并打印出每一个阶段的学生人数
			(分段方式:0-60; 60-80;80-100)
		5. 翻转传入数组中的元素
		例如有这样的数组 char[] arr = {'源', '代', '码', '教', '育'};
		arr中的内容是这样的{'育', '教', '码', '代', '源'};
		6. 使用嵌套循环打印下面图形
		1
		12
		123	
		1234
		12345
		123456
		1234567
		12345678
		123456789

		7.移除数组int[] arr = {1, 2, 3, 4, 5, 1, 9, 4, 12, 67, 1};中1这个元素，放到一个新的数组 （不带有1）。
		即新数组为int[] arr2 = {2, 3, 4, 5, 9, 4, 12, 67};


  
  
  
 
 */
public class _01Hw {
	public static void main(String[] args) {
		/*
		 * 1. 统计一个字符在字符数组中第一次出现的下标（直接输出）
		 * 	1.1 定义一个字符数组
		 * 	1.2 循环遍历数组
		 * 	1.3 把拿出来的字符和 目标字符进行比对
		 * 	1.4 如果比对上，直接break;
		 */
		//1.1 定义一个字符数组
		char[] carr= {'a','b','c','a','c','s','q','w','e','r','a'};
		//找c第一次出现的位置
		//	1.2 循环遍历数组
		for (int i = 0; i < carr.length; i++) {
			//1.3 把拿出来的字符和 目标字符进行比对
			if(carr[i]=='c'){
				System.out.println("第一次出现的位置为："+i);
				//如果比对上，直接break; 不需要再继续寻找
				break;
			}
		}
		/*
		 * 2. 统计一个字符在字符数组中出现的次数（直接输出）
		 *	2.1 定义一个字符数组
		 * 	2.2 循环遍历数组 
		 * 	2.3 把拿出来的字符和 目标字符进行比对
		 * 	2.4 相等进行累加计数
		 */
		/*
		 * a出现的次数
		 */
		int count =0;
		for (int i = 0; i < carr.length; i++) {
			if(carr[i]=='a'){
				count++;
			}
		}
		System.out.println("a在数组里面出现的次数为："+count);
		
		/*
		 * 
		 * 4. 现在有数组 double[] scores = {11, 34, 76, 77, 88, 99, 58, 97, 56};统计并打印出每一个阶段的学生人数
		 *	(分段方式:0-60; 60-80;80-100)
		 *	4.1 循环遍历数组
		 *	4.2 使用if-else-if判断所属的分数段
		 *	4.3 定义三个变量 分别计数
		 */
		double[] scores = {11, 34, 76, 77, 88, 99, 58, 97, 56};
		//4.3 定义三个变量 分别计数
		int a=0;
		int b=0;
		int c=0;
		for (int i = 0; i < scores.length; i++) {
			// 使用if-else-if判断所属的分数段
			if(scores[i]>=0 && scores[i]<60){
				c++;
			}else if(scores[i]>=60 && scores[i]<=80){
				b++;
			}else if(scores[i]>80 && scores[i]<=100){
				a++;
			}
		}
		System.out.println("0-60人数为："+c);
		System.out.println("60-80人数为："+b);
		System.out.println("80-100人数为："+a);
		
		/*
		 * 
		 *5. 翻转传入数组中的元素
		 *	例如有这样的数组 char[] arr = {'源', '代', '码', '教', '育'};
		 *	arr中的内容是这样的{'育', '教', '码', '代', '源'};
		 * 
		 */
		char[] arr = {'源', '代', '码', '教', '育'};
		/*
		//交换数组第一个和最后一个位置
		char temp=arr[0];
		arr[0]=arr[4];
		arr[4]=temp;
		//交换第二个和倒数第二个的位置
		char temp1=arr[1];
		arr[1]=arr[3];
		arr[3]=temp1;
		*/
		for (int i = 0; i < arr.length/2; i++) {
			char temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*  学完面向对象第二天就看得懂
		char[] ds = new StringBuffer(new String(arr)).reverse().toString().toCharArray();
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		*/
		/*
		 * 6. 使用嵌套循环打印下面图形
			1
			12
			123	
			1234
			12345
			123456
			1234567
			12345678
			123456789
		 *
		 */
		for(int i=1;i<=9;i++){//决定行数
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			//每行结束 换行
			System.out.println();
		}
		/*
		 7.移除数组int[] arr = {1, 2, 3, 4, 5, 1, 9, 4, 12, 67, 1};
		 	中1这个元素，放到一个新的数组 （不带有1）。
			即新数组为int[] arr2 = {2, 3, 4, 5, 9, 4, 12, 67};
 			7.1 统计老数组里面 有多少个1 这个元素
 			7.2 定义新数组，新数组的长度=老数组.length-1的个数
 			7.3 再把非1的元素移入到新数组里面
		 */
		int[] oldArr = {1, 2, 3, 4, 5, 1, 9, 4, 12, 67, 1};
		int cot=0;
		//	7.1 统计老数组里面 有多少个1 这个元素
		for (int i = 0; i < oldArr.length; i++) {
			//统计有多少个 元素为1
			if(oldArr[i]==1){
				cot++;
			}
		}
		//7.2 定义新数组，新数组的长度=老数组.length-1的个数
		int[] newArr=new int[oldArr.length-cot];
		//7.3 再把非1的元素移入到新数组里面
		int index=0;//新数组里面数据存放的开始位置
		for (int i = 0; i < oldArr.length; i++) {
			//不等于1的数据放入到新数组
			if(oldArr[i]!=1){//放到新数组里面的数据
				//每放一次数据 index自增1 记录下一个非1数据存放的位置
				newArr[index++]=oldArr[i];
				//index++;
			}
		}
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.println("----"+newArr[i]);
		}
	}
}

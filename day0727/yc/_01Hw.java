package day0727.yc;

import java.util.Arrays;

/**
 * 	2. 设计一个方法,传入一个int的数组,返回该数组中最大的值。
	3. 设计一个方法,查询并返回一个字符在字符数组中第一次出现的位置。
	4. 定一个求多个整数积的方法（使用可变参数完成）。
	5. 请设计一个方法swap，将int数组指定两个下标的元素交换。
	6. 请设计一个方法，将int数组arr中全部的元素批量初始化为int a。
	7. 请设计一个方法，将一个int数组arr1中指定的两个下标之间的元素删除。【
 * 
 * 
 */
public class _01Hw {
	
	public static void main(String[] args) {
		int[] arrs = {1,35,1,9,16,90,4,65};
		//调用我们自己设计的方法 获取数组的最大值
		int max = _01Hw.getMax(arrs);
		System.out.println(max);
		
		System.out.println("------------------------");
		char[] ar={'a','r','t','j','u','s','t','d','o','i','t'};
		int i = _01Hw.getIndex(ar,'c');
		System.out.println(i);
		
		int[] aray = {1,35,1,9,16,90,4,65};
		_01Hw.swap(aray, -1, 3);
		//查看交换后 数组里面的值
		System.out.println(Arrays.toString(aray));
		
		System.out.println("---------初始化数组-------");
		_01Hw.init(aray, 1);
		System.out.println(Arrays.toString(aray));
		System.out.println("------删除数组----------");
		int[] ay = {1,2,3,4,5,6,7,8,9};
		int[] delete = _01Hw.delete(ay,2,4);
		System.out.println(Arrays.toString(delete));
		
		
	}
	
	
	//2. 设计一个方法,传入一个int的数组,返回该数组中最大的值。
	public static int getMax(int[] arr){
		//1.对数组进行排序
		Arrays.sort(arr);
		//2.最后一个就是最大值
		return arr[arr.length-1];
	}
	
	//3. 设计一个方法,查询并返回一个字符在字符数组中第一次出现的位置。
	/*
	 * 形参：数组--查找的字符数组
	 * 		字符--去数组里面查询的目标
	 * 返回值：位置 ----索引
	 * 		 常规情况下0-n之间的一个数字
	 * 		特殊情况：万一没有找到
	 */
	
	public static int getIndex(char[] ar,char dest){
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==dest){
				return i;
			}	
		}	
		//防止 全部查找一次都没有找到的情况
		return -1;
	}
	
	//4. 定一个求多个整数积的方法（使用可变参数完成）。
	public static int getProduct(int... nums ){
		int pro=1;
		
		for (int i : nums) {
			pro*=i;
		}
		return pro;
	}
	
	//5. 请设计一个方法swap，将int数组指定两个下标的元素交换。
	public static void swap(int[] arr ,int src,int dest){
		if(src<0||src>=arr.length){//参数不合法
			System.out.println("请输入合法的参数");
			return;
		}
		if(dest<0||dest>=arr.length){//参数不合法
			System.out.println("请输入合法的参数");
			return;
		}
		
		//使用临时变量记录替换的其中一个位置
		int temp =arr[src];
		arr[src]=arr[dest];
		arr[dest]=temp;
		
	}
	
	//6. 请设计一个方法，将int数组arr中全部的元素批量初始化为int a。
	public static void init(int[] ar ,int a){
		/*for (int i = 0; i < ar.length; i++) {
			ar[i]=a;
		}*/
		/*
		 * static void fill(int[] a, int val)  将指定的int值分配给指定的int数组的每个元素。
		 */
		Arrays.fill(ar, a);
	}
	
	/*
	 * 7.请设计一个方法，将一个int数组arr1中指定的两个下标之间的元素删除
	 * 简单实现：
	 * 	System类里面有一个方法 
	 * 		arrayCopy()  这个方法实现功能 只要两句即可
	 * 	
	 */
	
	public static int[] delete(int[] arr ,int src,int dest){
		if(src<0||src>=arr.length){//参数不合法
			System.out.println("请输入合法的参数");
			return null;
		}
		if(dest<0||dest>=arr.length){//参数不合法
			System.out.println("请输入合法的参数");
			return null;
		}
		/*
		 * 	1.计算出要删除的元素个数    dest-src-------------2
			2.创建新的数组    长度=arr.length- 删除的元素个数
			3.写循环，把0-src位置的元素放到新数组里面
			4.写循环，把dest-arr.length-1位置的元素放到新数组里面
		 */
		//1.计算出要删除的元素个数    dest-src-------------2
		int count =dest-src;
		
		//2.创建新的数组    长度=arr.length- 删除的元素个数
		int[] newAr = new int[arr.length-count];
		int index=0;
		//3.写循环，把0-src位置的元素放到新数组里面
		for (int i = 0; i < src; i++) {
			newAr[index++]=arr[i];
		}
		//4.写循环，把dest-arr.length-1位置的元素放到新数组里面
		for (int i = dest; i < arr.length; i++) {
			newAr[index++]=arr[i];
		}
		return newAr;
	}
	
	
	
	
	
	
	
	
	
	
}

package day05;
/*
请打印输出月份所属于的季节，
	 * 	3、4、5 春
	 * 	6、7、8 夏
	 * 	9、10、11 秋
	 * 	12、1、2 冬
 	
 */

public class _05Switch {
	public static void main(String[] args) {
		int m= 6;
		//
		switch(m){
			case 3:
				//功能语句
				//break;
			case 4:
			case 5:
					System.out.println("春天");
					break;
			case 6:
				//功能语句
				//break;
			case 7:
			case 8:
					System.out.println("夏天");
					break;
			case 9:
				//功能语句
				//break;
			case 10:
			case 11:
					System.out.println("秋天");
					break;
			case 12:
				//功能语句
				//break;
			case 1:
			case 2:
					System.out.println("冬天");
					break;
		}
		
	}
}

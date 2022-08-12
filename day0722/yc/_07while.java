package day0722.yc;
/*
*
* */
public class _07while {
    public static void main(String[] args) {
//1.循环打印1-10的数字
		/*	int i=1;// 定义在外面 只是执行一次  后面循环运行起来以后，不断的改变i的值
		while(i<=10){
			System.out.println(i);
			//没运行一次，让i递增1
			i++;
		}
		*/
		System.out.println("----------------------------");
		//2.扩展：循环打印 100 -999 之间的数
		/*int num=100;//数字的下限
		//数字的上限
		while(num<=999){
			System.out.println(num);
			
			num++;
		}
		*/
		System.out.println("----------------------------");
		/*
		 * 2.找出1-10的偶数
		 * 	2.1 找出1-10的数
		 * 	2.2 判断是偶数才打印数字 
		 * 		判断是偶数：if    %   ==
		 */
		
		int y=1;
		while(y<=10){
			if(y%2==0){//y%2==0 判断 y能否被2整除
				//如果是个偶数才打印
				System.out.println(y);
			}
			y++;
		}
		
		/*
		 * 20-100的奇数和偶数
		 * 	1.20-100之间数
		 * 	2.使用if--else区分奇数还是偶数	
		 */
		int n=20;
		while(n<=100){
			if(n%2==0){
				//n能够被2整除
				System.out.println("偶数："+n);
			}else {
				//n不能被2 整除--奇数
				System.out.println("奇数："+n);
			}
			n++;
		}
	//水仙花数
        for (int i=100;i<=999;i++){
            int bai=(i/100);
            int shi=(i/10)%10;
            int ge=(i%10);
            if (Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3)==i){
                System.out.println(i);
            }
        }
        int i=100;
        while (i<=999){
            int bai=(i/100);
            int shi=(i/10)%10;
            int ge=(i%10);
            if (Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3)==i){
                System.out.println(i);
            }
            i++;
        }
    }
}

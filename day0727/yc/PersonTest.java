package day0727.yc;

public class PersonTest {
	public static void main(String[] args) {
		//创建对象 调用无参数的构造方法
		Person g1=new Person();
		//给对象赋值
		g1.name="二狗";
		g1.age=18;
		g1.sex=true;
		
		//2.在创建对象的时候同时给对象的属性赋值
		Person g2=new Person("坤坤",20,false);
		
		System.out.println(g1.name+" "+g1.age+"  "+g1.sex);
		System.out.println(g2.name+" "+g2.age+"  "+g2.sex);
	}
	
}

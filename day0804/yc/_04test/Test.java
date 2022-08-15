package cn.day0804.yc._04test;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("杨春", "1520000", "1001");
        Student stu2 = new Student("杨春1", "1520000", "1001");

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu2.hashCode());
        /*
        *       equals方法,用来比较两个对象里面存储的数据是否相等
                   public boolean equals(Object obj) {
                        return (this == obj);
                   }
                是Object类提供的，默认比较两个对象的地址值
        * */
        System.out.println(stu1.equals(stu2));
    }
}

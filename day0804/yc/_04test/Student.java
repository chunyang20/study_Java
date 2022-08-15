package cn.day0804.yc._04test;

/*
*   多态的运用：
*       以后在工作中：
*           1.接口多是使用多态的写法，屏蔽实现类之间的差异
*           2.多是用于方法形参设计的时候使用多态【重点】
*
* */

public class Student {
    private String name;
    private String phone;
    private String idCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }

    public Student(String name, String phone, String idCard) {
        this.name = name;
        this.phone = phone;
        this.idCard = idCard;
    }

    public Student() {
    }
    /*覆写equals方法
    *
    *       多态向上转型体现：
    *           equals的形参是Object，实质
    *           Object obj=stu2;
    *           Object obj=new Student("杨春", "1520000", "1001");
    * */
    @Override
    public boolean equals(Object obj) {   //使用父类类型object接收子类对象
        /*         不能改成Student,因为改了就不是方法重写了
        *       内部逻辑的思路：
        *           1.方法内部两个对象分别是this   obj
        *           2.分别使用this的name  和obj对象里面的name对比
        *           2.分别使用this的idCard和obj对象里面的idCard对比
        *           2.分别使用this的phone  和obj对象里面的phone对比
        *
        *           如果三个对比都相等，两个对象里面存储的数据就是想等
        *               其中任意一个不相等，两个对象对比的结果就是false
        *
        *           obj.name、obj.idCard、obj.phone报错因为obj类型是Object里面没有这些属性
        *           属性是子类Student的，要使用则需要将obj向下强制转型
        * */
        System.out.println(obj.hashCode());
        if (!(obj instanceof Student)){         //严谨判断obj类型不是Student直接false
            return false;
        }
        Student stu=(Student)obj;
        if (!this.name.equals(stu.name)){       //本来是obj.name，但是obj父类里面没有子类的属性，所以需要向下强制转型
            return false;
        }
        if (!this.idCard.equals(stu.idCard)){
            return false;
        }
        if (!this.phone.equals(stu.phone)){
            return false;
        }
        return true;
    }
}

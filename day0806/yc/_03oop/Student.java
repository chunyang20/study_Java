package cn.day0806.yc._03oop;

import java.util.Objects;

/*
*   1.权限修饰符:         private--修饰的成员只能在当前类里面使用
*   2.get/set方法        分别是用来对属性的赋值与取值的
*       当字段的类型为Boolean  get方法变更为is
*   3.this
*       用法一：this所在的方法被哪个对象调用，this就是哪个对象
*       作用：用来区分成员变量和局部变量的二义性
*       用法二：构造方法之间的相互调用--调用无参的构造方法
*   4.构造方法：
*       特点：
*           1.没有返回值类型
*           2.方法名和类名一致
*           3.每一个类里面都默认有一个隐式的公共无参数构造方法,如果显示的写了任何的构造方法，隐式的就不存在了
*   5.super
*       用法一：
*           super();调用父类的构造方法
*
*
* */
public class Student {
    private String name;
    private int age;
    private boolean sex;
    private String phone;

    void login(){
        System.out.println("成绩查询登录");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;           //this所在的方法被stu1调用，this就是stu1，等同于stu1.name="无极剑圣
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Student(String name, int age, boolean sex, String phone) {
        //用法二：构造方法之间的相互调用--调用无参的构造方法
        this();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }

    public Student() {
        //super();            //删不删都会调
    }
    //存在的意义：为了打印对象的时候，打印的是对象的内容
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && sex == student.sex && Objects.equals(name, student.name) && Objects.equals(phone, student.phone);
    }

}

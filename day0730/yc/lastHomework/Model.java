package day0730.yc.lastHomework;
/*
*   JavaBean: javaWeb里面的一个概念，用来封装数据使用的
*       1.类必须使用public修饰
*       2.成员变量私有化
*       3.私有化的成员提供get和set
*       4.必须提供公共无参数的构造方法
*/
public class Model {
    //姓名，年龄，性别，胸围，腰围
    private String name;
    private boolean sex;
    private int age;
    private double bust;
    private double waist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBust() {
        return bust;
    }

    public void setBust(double bust) {
        this.bust = bust;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public Model() {

    }

    public Model(String name, boolean sex, int age, double bust, double waist) {
        this();             //调用无参的构造方法，只能写在第一句
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.bust = bust;
        this.waist = waist;
    }

}

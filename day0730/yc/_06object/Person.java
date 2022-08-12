package day0730.yc._06object;

import java.lang.Object;

public class Person {
    private String name;
    private int age;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /*
    * 复写父类的toString（）方法
    * 目的：为了能够查看对象里面存储的数据
    * 子类覆写了toString后，在打印对象，优先调用子类的toString（）方法
    * */
//    public String toString(){
//        return "name="+name+",age="+age+",phone="+phone;
//    }
        //自动生成
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }



    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Person() {

    }
    //子类覆写父类的equals方法，父类的底层是使用的==，不能满足使用


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && phone.equals(person.phone);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

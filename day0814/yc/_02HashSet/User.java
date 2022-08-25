package cn.day0814.yc._02HashSet;

import java.util.Objects;

/**
 * @author 杨春
 * @DATE 2022/8/15 9:13
 */
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

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

    /*
    @Override
    public boolean equals(Object o) {
        System.out.println("++++调用了equals方法+++");
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("++++调用了hashcode方法+++");
        return 0;
    }
    */

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

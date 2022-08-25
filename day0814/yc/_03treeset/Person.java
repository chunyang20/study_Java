package cn.day0814.yc._03treeset;

/**
 * @author 杨春
 * @DATE 2022/8/14 10:33
 */
/**
    类实现Comparable模式：自然排序

 */
public class Person implements Comparable {
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    /**
     *
     * TreeSet在添加数据的时候会去调用此方法
     *  返回值：
     *      0：重复
     *      正整数或者负数：数据进行升序或者降序排序
     */
    @Override
    public int compareTo(Object o) {
        //o是容器里面有的数据，this是新添加的数据
        System.out.println("this:   "+this);
        System.out.println("o参数:    "+o);
        //需求按照年龄排序  this    o
        Person p=(Person) o;
        if (this.age==p.age){
            //如果年龄相同比较名字，名字相同视为重复
            if (this.name.equals(p.name)){
                return 0;
                //名字不同按照一定顺序排
            }else {
                return 1;
            }
        }else if (this.age>p.age){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

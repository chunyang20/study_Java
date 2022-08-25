package cn.day0814.yc._03treeset;

import java.util.Comparator;

/**
 * @author 杨春
 * @DATE 2022/8/14 11:52
 */
public class StudentRule implements Comparator {

    /**
     * TreeSet在添加数据的时候会去调用此方法返回值:
     *     0:重复
     *     正整数或者负数:数据进行升序或者降序排序
     */
    @Override
    public int compare(Object o1, Object o2) {
        //向下强转

        Student s1=(Student) o1;
        Student s2=(Student) o2;

        if (s1.getAge()==s2.getAge()){
            return 0;
        } else if (s1.getAge()>s2.getAge()) {
            return -1;
        }else {
            return 1;
        }

    }

}

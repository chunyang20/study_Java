package cn.day0806.yc._01enum;
/*
*
*       枚举和类一个级别，也会产生class文件
*       类型的划分里面引用数据类型:
*           引用数据类型：类、数组、接口、枚举
*       作用：
*           使用一种类型去表示固定的几个值
*
*       一般来讲 枚举是和Switch一起使用的
*
*   枚举的继承体系：
*      object
*           --Enum
*               --自定义的枚举类
*
*   枚举里面的字段代表枚举的对象
*
*   枚举里面有哪些成员？
*       成员变量
*       构造方法---->不允许创建对象
*
*
*使用Gender表示有固定的三个取值
* */
public enum Gender {
    //MAN,WOMEN,UNKNOWN;      Gender类型的对象       //三个对象，其实就是在调用Gender无参构造方法，要打印三次------

    // MAN("男"),WOMEN("女"),UNKNOWN("未知");       调用Gender有参构造方法
    MAN("男"),WOMEN("女"),UNKNOWN();


    //Gender类型的对象
    String name;
    Gender(){           //无参构造，把第一行注释打开调用
        System.out.println("--------");
    }
    Gender(String name){
        this.name=name;
    }
    public void show(){
        System.out.println("枚举调用方法");
    }

    @Override
    public String toString() {
        return name==null?super.toString():name;
    }
}

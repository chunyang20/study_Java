package cn.day0811.yc._01arraylist;


import java.util.Arrays;

/**
 * @author 杨春
 * @DATE 2022/8/11 9:40
 */
/*
创建一种能够存储任意数据类型,任意长度的一种容器?
以前学习过的能够装数据的容器有哪些?
1.变量    int i =10;  一次只能装指定类型的一个数据
2.数组    能够装多个【长度依然收到限制】指定类型的数据


整体任务:我们自己去定义一个类型，可以装任意数据类型，任意长度的容器

    v1:定义一个可以装指定类型(int),指定长度(10)一个容器
        1.1提供一个添加数据的方法，形参就是用户要添加的数据
        1.2准备一个数组,用来存放用户每一次添加的数据
        1.3定义一个成员变量，用来去动态记录数据的在数据里面添加的位置
        1.4提供一个方法，方便用户去查看容器里面存储迪数据


    v2:定义一个可以装任意类型,指定长度的一个容器
        2.1 自定义容器的底层，用于去存储数据的容器数组，数组的类型是int
      	2.2 Object类型可以去兼容任意数据类型--把底层数组的类型更改为Object
    v3:定义一个可以装任意类型,任意长度的一个容器
        3.1 数组的长度一旦定义就不能更改，重新定义一个更大的数据把地址值给arr
  		3.2 在添加方法add里面，先去检查数组是否够用
  		3.3	如果不够，自动扩容
  				3.3.1创建一个容量更大的数组
  				3.3.2把原来数组里面的数据 移动到新数组
  				3.3.3把新数组的地址值赋值给arr
  		3.4 提供两个构造方法，用户可以灵活使用容器
    v4:提供一些额外的功能
 */
public class MyArrayList_v3 {
    /**
     * 给不知道自己有多少数据要存储的用户使用 ，默认长度就是10
     */

    public MyArrayList_v3(){
        //arr = new Object[10];
        this(10);
    }
    /**
     *@param length 给知道自己有多少数据要存储的用户使用，由用户自己指定容器的初始长度
     */
    public MyArrayList_v3(int length){
        arr = new Object[length];
    }
    //1.2 准备一个数组，用来存放用户每一次添加的数据
    private  Object[]arr;
    /**
     * @param e 用户添加的元素数据
     * 用户每调用一次这个方法，把数据存储起来
     *
     */
    //用来记录数据添加的索引位置，size其实就是添加数据个数
    private int size=0;

    public void add(Object e){
        //首先检查arr数组是否能够放得下新添加的数据（要不要扩容）
        if(size>=arr.length){//容量不够判断条件
            //创建一个容量更大的数组
            Object[] newArr = new Object[arr.length*2];
            //把原来数组里面的数据 移动到新数组
            System.arraycopy(arr, 0, newArr, 0, size);
            //把新数组的地址值赋值给arr    因为数组长度一旦确定就不能更改，所以全局变量arr指向newArr的地址
            arr=newArr;
        }
        //先把数据添加到数组里面
        arr[size]=e;
        //为了记录下一次添加数据的位置
        size++;
    }


    /**
        1.4 提供一个方法，方便用户去查看容器里面存储逇数据
            MyArrayList [arr=[6, 16, 26, 36, 46, 56, 666, 0, 0, 0], size=7]
	 	    以上为工具覆写toString的打印结果，用户只是添加7个数据  后面的0, 0, 0 用户体验不好，带来误解
	    期望的结果：用户添加了哪些数据，打印哪些数据

     */
    @Override
    public String toString() {
        /*
        String str="[";
        for (int i=0;i<index;i++){
            if (i==index-1){
                str+=arr[i]+"]";
            }else {
                str+=arr[i]+" ,";
            }

        }
        */
        /*
         * 方式二：
         * 	1.新建一个长度为 size的数组
         * 	2.使用System里面arraycopy的方法把arr数组里面 size个数据拷贝到新数组
         * 	3.输出打印新数组
         */
        //1.新建一个长度为 size的数组
        Object[] newArr=new Object[size];
        //2.使用System里面arraycopy的方法把arr数组里面 size个数据拷贝到新数组
        System.arraycopy(arr,0,newArr,0,size);
        //3.输出打印新数组
        return Arrays.toString(newArr);
    }
}

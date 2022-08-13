package cn.yc.day0801.start;

import cn.yc.day0801.entity.Admin;
import cn.yc.day0801.entity.Student;


import java.util.Scanner;


public class StudentStart {
    //Admin类型的数组--Admin类型的对象
    static Admin[]arr=new Admin[5];
    static Student[]stuArr=new Student[10];

    public static void main(String[] args) {
        //调用初始化管理员数据的代码
        StudentStart.init();
        boolean loginState=StudentStart.login();
        if(loginState){
            //调用展示菜单的方法
            StudentStart.menu();



        }else {
            System.out.println("账户或密码不正确");
        }
    }
    /*
    * 用来登录的方法：
    *   1.获取用户输入的用户名和密码
    *   2.和数据池arr数组里面的数据进行比对
    * */
    public static boolean login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username= sc.next();
        System.out.println("请输入密码：");
        String password= sc.next();
        //进行数据的比对
        for (Admin admin:arr) {
            String uname= admin.getUsername();
            String pwd= admin.getPassword();

            if(uname.equals(username)&&pwd.equals(password)&&admin.getState()==1){
                return true;
            }
        }
        return false;
    }
    public static void init(){
        //给arr数组填充初始数据
        arr[0]=new Admin(1,"root","123456",1);
        arr[1]=new Admin(2,"admin","123456",1);
        arr[2]=new Admin(3,"lzx","123456",1);
        arr[3]=new Admin(4,"ff","123456",-1);
        arr[4]=new Admin(5,"艾克","123456",1);
        //给arr1数组填充初始数据
        stuArr[0]=new Student(1,"杨过",true,20,"全真教","古墓派","古墓",1);
        stuArr[1]=new Student(2,"小龙女",false,20,"古墓","古墓派","古墓",1);
        stuArr[2]=new Student(3,"张三丰",true,20,"道教","古墓派","古墓",1);
        stuArr[3]=new Student(4,"萧峰",true,20,"丐帮","古墓派","南院",-1);
        stuArr[4]=new Student(5,"黄蓉",false,20,"丐帮帮主","桃花岛","桃花岛",1);
    }
    public static void menu(){
        System.out.println("---------------欢迎来到学生管理系统--------------");
        System.out.println("1.查询所有学员");
        System.out.println("2.根据ID查询学员");
        System.out.println("3.根据ID删除学员");
        System.out.println("4.修改学员信息");
        System.out.println("5.添加学员");
        System.out.println("6.退出系统");
        //用户选择菜单
        System.out.println("请选择功能：");
        Scanner sc=new Scanner(System.in);
        int type= sc.nextInt();

        switch (type){
            case 1:
                queryAll();
                break;
            case 2:
                queryById();
                break;
            case 3:
                deleteStu();
                break;
            case 4:
                updateById();
                break;
            case 5:
                addStu();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("敬请期待：");
                break;
        }
    }

    private static void addStu() {
        for (int i = 0; i < stuArr.length; i++) {
            //找到数组里面从索引0开始，第一个为null的位置
            if (stuArr[i]==null){
                Scanner sc=new Scanner(System.in);
                System.out.println("请输入学号：");
                int id=sc.nextInt();
                System.out.println("请输入姓名：");
                String name=sc.next();
                System.out.println("请输入性别：");
                Boolean sex=sc.nextBoolean();
                System.out.println("请输入年龄：");
                int age=sc.nextInt();
                System.out.println("请输入电话：");
                String phone=sc.next();
                System.out.println("请输入班级：");
                String classes=sc.next();
                System.out.println("请输入地址：");
                String address=sc.next();
                System.out.println("请输入状态：");
                int state=sc.nextInt();
                Student student=new Student(id,name,sex,age,phone,classes,address,state);
                stuArr[i]=student;
                //添加完成
                System.out.println("数据添加完成");
                queryAll();
                menu();
                return;

            }
        }
        System.out.println("招生已结束");
        menu();
    }

    //删除学员
    private static void deleteStu() {
        System.out.println("请输入要删除的学员ID：");
        Scanner sc=new Scanner(System.in);
        //删除学员的学号
        int ID=sc.nextInt();
        int index=-1;
        for (int i=0;i< stuArr.length;i++){
            //拿数组里面的每一个对象id跟输入的ID进行比较
            if (stuArr[i]!=null&&stuArr[i].getId()==ID){
                //删除数据以后给index赋值删除的索引
                index=i;
            }
        }
        if (index==-1){
            System.out.println("暂无此学员，请核对删除的学号");
            menu();
            return;
        }
        //从原数组的index+1开始考到原数组的index，拷贝长度为原数组长度-索引值再-1
        System.arraycopy(stuArr,index+1,stuArr,index,stuArr.length-index-1);                 //将老数组0开始到新数组0，长度是ID长度-1
        System.out.println("删除数据成功");
        if (index== arr.length-1){
            stuArr[index]=null;
        }
        queryAll();
        menu();
    }

    //查询所有学员信息
    private static void queryAll() {
        System.out.println("学号\t\t姓名 \t\t性别 \t年龄 \t电话 \t\t班级 \t\t地址 \t\t状态");
        for (Student stu:stuArr){

            if (stu!=null){
                String sex;
                if (stu.isSex()){
                    sex="男";
                }else {
                    sex="女";
                }

                String state;
                if (stu.getState()==0){
                    state="在读";
                }else if (stu.getState()==1){
                    state="毕业";
                }else {
                    state="休学";
                }

                System.out.println(stu.getId()+" \t\t"+stu.getName()+" \t\t"+sex+" \t\t"+stu.getAge()+" \t\t"
                +stu.getPhone()+" \t\t"+stu.getClasses()+" \t\t"+stu.getAddress()+" \t\t"+state);
            }
        }
        menu();
    }

    /*
    *       根据用户输入的学号，查询整个用户信息
    *           1.提示用户输入学号
    *           2.循环数组，把每一个数据里面的ID和用户输入的ID进行比对
    *           3.比对无误，展示该条信息    *
    * */
    private static void queryById() {
        System.out.println("请输入要查询的学号：");
        Scanner sc=new Scanner(System.in);
        int id= sc.nextInt();
        System.out.println("学号 \t姓名 \t性别 \t年龄 \t电话 \t班级 \t地址 \t状态");
        for (Student stu:stuArr){
            if (stu!=null&&stu.getId()==id){
                    String sex;
                    if (stu.isSex()){
                        sex="男";
                    }else {
                        sex="女";
                    }

                    String state;
                    if (stu.getState()==0){
                        state="在读";
                    }else if (stu.getState()==1){
                        state="毕业";
                    }else {
                        state="休学";
                    }
                    //把数据进行格式输出
                    System.out.println(stu.getId()+" \t"+stu.getName()+" \t"+sex+" \t"+stu.getAge()+" \t"
                    +stu.getPhone()+" \t"+stu.getClasses()+" \t"+stu.getAddress()+" \t"+state);

            }
        }
        menu();
    }

    public static void updateById(){
        System.out.println("请输入修改学员的学号");
        Scanner sc=new Scanner(System.in);
        int id= sc.nextInt();

        for (Student stu:stuArr){
            if (stu!=null&&stu.getId()==id){
                System.out.println("请输入姓名：");
                String name=sc.next();
                stu.setName(name);
                System.out.println("请输入性别：");
                Boolean sex=sc.nextBoolean();
                stu.setSex(sex);
                System.out.println("请输入年龄：");
                int age=sc.nextInt();
                stu.setAge(age);
                System.out.println("请输入电话：");
                String phone=sc.next();
                stu.setPhone(phone);
                System.out.println("请输入班级：");
                String classes=sc.next();
                stu.setClasses(classes);
                System.out.println("请输入地址：");
                String address=sc.next();
                stu.setAddress(address);
                System.out.println("请输入状态：");
                int state=sc.nextInt();
                stu.setState(state);
                //修改成功
                System.out.println("数据修改成功");
                queryAll();
                menu();
                return;
            }
        }
        System.out.println("修改数据的学号不正确，请重新输入");
        updateById();

    }
}

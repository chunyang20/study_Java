package cn.yc.day0801.entity;

public class Admin {
    //编号
    private int id;
    //姓名
    private String username;
    //密码
    private String password;
    //状态   0审核  1正常 -1 禁用
    private int state;
    /*
    * 覆写toString方法，打印Admin对象的时候不会打印地址值
    * */
    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                '}';
    }
    //4个参数构造
    public Admin(int id, String username, String password, int state) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.state = state;
    }
    //无参构造
    public Admin() {
    }
    //getter,setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}

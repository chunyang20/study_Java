package day0729.yc._04this;

public class User {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set方法里面的this"+this);
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String password) {
        this();
        System.out.println("调用有参的构造方法");
        this.name = name;
        this.password = password;
    }
    public User(){
        System.out.println("调用无参的构造方法");
    }
}

package day0727.yc;
/*
*       类：对一个群体的抽象
*       成员变量：用来描述手机的公共特征，属性【字段，属性，成员变量】
*       引用数据类型：类、接口、枚举、数组
*
* */
public class Phone {
    //品牌
    String brand;
    //价格
    double price;
    //型号
    String type;
    //上市时间
    String createTime;
    //颜色
    String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Computer{
    String brand;
    String type;
    double price;
    //尺寸
    String size;
    //上市时间
    String createTime;

}

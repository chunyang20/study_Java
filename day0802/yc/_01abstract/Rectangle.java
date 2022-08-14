package cn.day0802.yc._01abstract;

public class Rectangle extends Graph{
    private double width;
    private double height;

    //面积

    @Override
    public double getArea() {
        return width*height;
    }

    //周长
    public double getGirth(){
        return 2*(width+height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

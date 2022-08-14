package cn.day0802.yc._01abstract;

public class Circle extends Graph{
    private double r;
    //面积
    public double getArea(){
        return Math.PI*r*r;
    }

    @Override
    public double getGirth() {
        return 2*Math.PI*r;
    }
    //周长


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}

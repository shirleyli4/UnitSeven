package com.company;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double leng,double wid){
        length=leng;
        width=wid;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        double area=length*width;
        return area;
    }

}

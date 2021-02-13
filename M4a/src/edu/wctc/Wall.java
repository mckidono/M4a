package edu.wctc;

import java.io.Serializable;

public class Wall implements Serializable {
    private double width;
    private double height;

    public Wall(double Width,double Height){

        width=Width;
        height=Height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return height*width;
    }
}

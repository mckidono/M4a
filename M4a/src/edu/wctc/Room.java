package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Room implements Serializable {
    private List<Wall> wallList=new ArrayList<>();
    private double area;


    public Room(double width, double length,double height){
        Wall wall1=new Wall(width, height);
        wallList.add(wall1);
        Wall wall2=new Wall(width, height);
        wallList.add(wall2);
        Wall wall3=new Wall(length, height);
        wallList.add(wall3);
        Wall wall4=new Wall(length, height);
        wallList.add(wall4);

    }


    public double getArea(){
        area=0;

       for(int x=0; x<wallList.size();x++){
           Wall w=wallList.get(x);
           area=area+w.getArea();
       }
       return area;
    }

    @Override
    public String toString() {
        return  ""+getArea();

    }
}

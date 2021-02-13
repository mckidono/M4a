package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PaintCalculator implements Serializable {
    private List<Room> roomList=new ArrayList<>();

     public void addRoom(double length, double width, double height){
        Room room=new Room(length, width,height);
        roomList.add(room);
     }

    @Override
    public String toString() {
        String output="";
        if(roomList.size()==0){
            output="There are no rooms";
        }
        else{
        for(int x=0; x<roomList.size();x++){
         Room r=roomList.get(x);
        output = output.concat("Room with area:"+r.toString()+"\n");
        }}
        return output;
    }

}

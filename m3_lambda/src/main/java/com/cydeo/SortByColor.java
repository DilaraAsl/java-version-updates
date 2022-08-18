package com.cydeo;

public class SortByColor implements SortInventory{


    String color;
    public SortByColor(String color){
        this.color=color;
    }
    public void sort() {
        int count=0;
        if(color.equals("green")){
            count++;
        }
    }
}

package com.cydeo;

public class SortByWeight implements SortInventory {
    double weight;
public SortByWeight(double weight){
    this.weight=weight;
}
    @Override
    public void sort() {
        System.out.println("sorting by weight");
    }


}

package com.cydeo;

public class SortInventoryTester {
    public static void main(String[] args) {
        SortInventoryTester st=new SortInventoryTester();
        SortByColor sbc=new SortByColor("green");
        SortByWeight sbw=new SortByWeight(100.0);
        st.sort(sbw);

    }
    private static void sort(SortInventory si){
        si.sort();
    }
}

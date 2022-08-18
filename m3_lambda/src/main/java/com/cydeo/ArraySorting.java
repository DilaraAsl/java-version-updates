package com.cydeo;

public class ArraySorting { //QuickSort, BubbleSort
    public static void main(String[] args) {
        ArraySorting as=new ArraySorting(); // Java creates an obj first to call the method
                                            // this is how methods works in Jav
        QuickSort qs=new QuickSort();
        BubbleSort bs=new BubbleSort();
        // functional programming accepts functions as an argument
        as.sort(qs); // behavior  is passed as an argument
        as.sort(bs); // behavior

        Sorting quickSort=()-> System.out.println("Quick Sorting");
        as.sort(quickSort);
        as.sort(()-> System.out.println("Quick Sorting")); // we don't need quicksort and bubble sort classes
        as.sort(()-> System.out.println("Bubble Sorting"));
    }
    private void sort(Sorting sorting){ // passing actions or functions to this method we are passing behavior to our method
       sorting.sort();
    }
}

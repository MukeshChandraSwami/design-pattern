package com.learn;

public class QuickSort extends Sorter {

    public QuickSort() {
        super.type = SortingType.QUICK_SORT;
    }
    @Override
    public void sort() {
        System.out.println("Sorting via QUICK SORT");
    }
}

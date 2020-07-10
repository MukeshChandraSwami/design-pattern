package com.learn;

public class MergeSort extends Sorter{

    public MergeSort() {
        super.type = SortingType.MERGE_SORT;
    }
    @Override
    public void sort() {
        System.out.println("Sorting via MERGE SORT");
    }
}

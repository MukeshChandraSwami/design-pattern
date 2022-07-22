package com.learn;

public class SorterFactory {

    public static Sorter getSorter(SorterAlgo sorterAlgo) {
        return switch (sorterAlgo) {
            case MERGE_SORT -> new MergeSort();
            case QUICK_SORT -> new QuickSort();
            case SELECTION_SORT -> new SelectionSort();
        };
    }
}

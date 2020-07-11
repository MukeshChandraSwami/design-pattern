package com.learn;

public class SorterFactory {

    public static Sorter getSorter(SorterAlgo sorterAlgo) {
        switch (sorterAlgo) {
            case MERGE_SORT:
                return new MergeSort();
            case QUICK_SORT:
                return new QuickSort();
            case SELECTION_SORT:
                return new SelectionSort();
        }
        throw new RuntimeException("Not supported : " + sorterAlgo);
    }
}

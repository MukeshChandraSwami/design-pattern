package com.learn;

public class SortingExecutor {

    public void sort(Sorter sorter) {
        switch (sorter.type) {
            case MERGE_SORT:
                doMergeSort(sorter);
                break;
            case QUICK_SORT:
                doQuickSort(sorter);
                break;
        }
    }

    private void doQuickSort(Sorter sorter) {
        sorter.sort();
    }

    private void doMergeSort(Sorter sorter) {
        sorter.sort();
    }
}

package com.learn;

public class Main {

    public static void main(String[] args) {
        SortingExecutor executor = new SortingExecutor();
        executor.sort(SorterFactory.getSorter(SorterAlgo.SELECTION_SORT));
    }
}

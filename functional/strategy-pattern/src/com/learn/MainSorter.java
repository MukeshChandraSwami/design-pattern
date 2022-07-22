package com.learn;

public class MainSorter {

    public static void main(String[] args) {
        SortingExecutor executor = new SortingExecutor();
        executor.sort(new SelectionSort());
    }
}

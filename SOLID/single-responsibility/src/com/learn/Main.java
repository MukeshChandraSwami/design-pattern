package com.learn;

public class Main {

    public static void main(String[] args) {
        Book book = new BookImpl("Data Structure", 120);
        book.save();
        book.print();
    }
}

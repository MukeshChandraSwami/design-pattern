package com.learn;

public class MainIterator {

    public static void main(String[] args) {
        NameRepo nameRepo = new NameRepo(new String[]{"Data Structure", "Design Patterns", "Lambda"});
        nameRepo.forEach(System.out::println);
    }
}

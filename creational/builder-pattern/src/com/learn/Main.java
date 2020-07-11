package com.learn;

public class Main {

    public static void main(String[] args) {
        Student student = new Student.Builder("Mukesh Swami",101)
                .setAge(28)
                .setEmail("mukesh.swami.501598@gmail.com")
                .setCls(11)
                .build();
        System.out.println(student);
    }
}

package com.learn;

public class TestByClone {

    public static void main(String[] args) throws Exception {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        show("s1", s1);
        show("s2", s2);

        Singleton s3 = (Singleton) s2.clone();
        show("s3", s3);
    }

    private static void show(String objectName, Singleton s) {
        System.out.println("Name :- " + objectName + " <--> Hash Code :- " + s.hashCode());
    }
}

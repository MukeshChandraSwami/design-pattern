package com.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestBySerialization {

    public static void main(String[] args) throws Exception {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        show("s1", s1);
        show("s2", s2);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.txt"));
        oos.writeObject(s2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.txt"));
        Singleton s3 = (Singleton)ois.readObject();
        show("s3", s3);
    }

    private static void show(String objectName, Singleton s) {
        System.out.println("Name :- " + objectName + " <--> Hash Code :- " + s.hashCode());
    }
}

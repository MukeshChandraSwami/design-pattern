package com.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonByEnumTest {

    public static void main(String[] args) throws Exception {
        SingletonByEnum s1 = SingletonByEnum.SINGLETON;
        SingletonByEnum s2 = SingletonByEnum.SINGLETON;

        show("s1", s1);
        show("s2", s2);

        // Testing with serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.txt"));
        oos.writeObject(s2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.txt"));
        SingletonByEnum s3 = (SingletonByEnum)ois.readObject();
        show("s3", s3);
    }

    private static void show(String objectName, SingletonByEnum s) {
        System.out.println("Name :- " + objectName + " <--> Hash Code :- " + s.hashCode());
    }
}

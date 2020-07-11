package com.learn;

import java.lang.reflect.Constructor;

public class TestByReflection {

    public static void main(String[] args) throws Exception {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        show("s1", s1);
        show("s2", s2);

        Class<?> clazz = Class.forName("com.learn.Singleton");
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s3 = (Singleton)constructor.newInstance();
        show("s3", s3);
    }

    private static void show(String objectName, Singleton s) {
        System.out.println("Name :- " + objectName + " <--> Hash Code :- " + s.hashCode());
    }
}

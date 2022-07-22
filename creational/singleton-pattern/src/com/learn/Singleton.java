package com.learn;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static volatile Singleton singleton;

    private Singleton() {
        if(singleton != null) {
            throw new RuntimeException("It is already created.");
        }
        Singleton.singleton = this;
        System.out.println("Creating a singleton object.");
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * This helps at the time of deserialization.
     * It do not let a new object to be created.
     * It returns this singleton object that we have already created.
     * @return
     * @throws ObjectStreamException
     *
     */
    @Serial
    private Object readResolve() throws ObjectStreamException {
        System.out.println("Loading from read resolve");
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //throw  new CloneNotSupportedException("Cloning is not allowed because of its singleton behaviour.");
        return Singleton.singleton;
    }
}

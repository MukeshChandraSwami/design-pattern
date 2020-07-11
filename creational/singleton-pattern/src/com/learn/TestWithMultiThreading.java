package com.learn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestWithMultiThreading {

    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 5; i++) {
            service.submit(TestWithMultiThreading::useSingleton);
        }
        service.shutdown();
    }

    private static void useSingleton() {
        Singleton instance = Singleton.getInstance();
        show("s", instance);
    }

    private static void show(String objectName, Singleton s) {
        System.out.println("Name :- " + objectName + " <--> Hash Code :- " + s.hashCode());
    }
}

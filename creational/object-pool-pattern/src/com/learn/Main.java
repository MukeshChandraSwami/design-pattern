package com.learn;


public class Main {

    public static void main(String[] args) throws Exception {
        ResourcePool<JDBCConnection> pool = new MyJDBCConnectionPool(5);

        System.out.println("Size :- " + pool.size());

        try(JDBCConnection borrowed = pool.borrow()) {
            System.out.println("Size :- " + pool.size());
            borrowed.createConnection();
        }

        System.out.println("Size :- " + pool.size());
    }
}

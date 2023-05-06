package com.learn;

public class JDBCConnection implements AutoCloseable {

    private final int INSTANCE_ID = this.hashCode();
    private final ResourcePool<JDBCConnection> pool;
    public JDBCConnection(ResourcePool<JDBCConnection> pool) {
        this.pool = pool;
        System.out.println("Initializing JDBC resource with instance id:- " + INSTANCE_ID);
    }
    public void createConnection() {
        System.out.println("Creating JDBC connection with instance id :- " + INSTANCE_ID);
    }

    private void closeConnection() {
        System.out.println("Closing JDBC connection with instance id :- " + INSTANCE_ID);
    }

    @Override
    public void close() throws Exception {
        closeConnection();
        pool.returnRes(this);
    }
}

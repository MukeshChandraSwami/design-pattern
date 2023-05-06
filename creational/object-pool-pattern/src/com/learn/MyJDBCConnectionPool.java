package com.learn;

public class MyJDBCConnectionPool extends ResourcePool<JDBCConnection> {


    public MyJDBCConnectionPool(int size) {
        super(size);
    }

    @Override
    public JDBCConnection create() {
        return new JDBCConnection(this);
    }
}

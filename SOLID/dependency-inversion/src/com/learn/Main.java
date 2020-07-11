package com.learn;

public class Main {

    public static void main(String[] args) {

        DatabaseHandler handler = new DatabaseHandler(new OracleDatabase());
        handler.connect();
        handler.disConnect();
    }
}

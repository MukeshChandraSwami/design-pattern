package com.learn;

public class Source {

    private String name;
    private String sal;

    public Source(String name, String sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public Source setName(String name) {
        this.name = name;
        return this;
    }

    public String getSal() {
        return sal;
    }

    public Source setSal(String sal) {
        this.sal = sal;
        return this;
    }
}

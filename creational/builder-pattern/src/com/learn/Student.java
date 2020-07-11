package com.learn;

public class Student {

    private String name;
    private String email;
    private int rollNum;
    private int cls;
    private int age;

    private Student(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.rollNum = builder.rollNum;
        this.cls = builder.cls;
        this.age = builder.age;
    }

    public static class Builder {

        private final String name;
        private final int rollNum;
        private String email;
        private int cls;
        private int age;

        public Builder(String name, int rollNum) {
            this.name = name;
            this.rollNum = rollNum;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCls(int cls) {
            this.cls = cls;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNum=" + rollNum +
                ", class=" + cls +
                ", age=" + age;
    }
}

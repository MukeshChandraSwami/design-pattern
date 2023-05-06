package com.learn;

public class Tortoise implements MarioElements<Tortoise>, Cloneable {

    private final String color;
    private boolean hasThorn;

    public Tortoise(String color, boolean hasThorn) {
        this.color = color;
        this.hasThorn = hasThorn;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasThorn() {
        return hasThorn;
    }

    public Tortoise setHasThorn(boolean hasThorn) {
        this.hasThorn = hasThorn;
        return this;
    }

    @Override
    public Tortoise copy() {
        try {
            return (Tortoise) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Tortoise{" +
                "color='" + color + '\'' +
                ", hasThorn=" + hasThorn +
                '}';
    }
}

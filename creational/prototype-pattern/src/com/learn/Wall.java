package com.learn;

public class Wall implements MarioElements<Wall>, Cloneable {

    private final int height;
    private final int width;
    private Position pos;
    private boolean strong;

    public Wall(int height, int width, boolean strong) {
        this.height = height;
        this.width = width;
        this.strong = strong;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isStrong() {
        return this.strong;
    }

    public Wall setStrong(boolean strong) {
        this.strong = strong;
        return this;
    }

    public Wall setPos(Position pos) {
        this.pos = pos;
        return this;
    }

    @Override
    public Wall copy() {
        try {
            return (Wall) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                ", width=" + width +
                ", pos=" + pos +
                ", strong=" + strong +
                '}';
    }
}

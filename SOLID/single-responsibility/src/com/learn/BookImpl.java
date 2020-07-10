package com.learn;

public class BookImpl implements Book {

    private int page;
    private String name;
    private PrintOperation printOperation;
    private BookModificationOperation modificationOperation;

    public BookImpl(String name, int page) {
        this.page = page;
        this.name = name;
        this.printOperation = new PrintOperation();
        this.modificationOperation = new BookModificationOperation();
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        this.modificationOperation.save(this);
    }

    @Override
    public void print() {
        this.printOperation.print(this);
    }

    @Override
    public String toString() {
        return this.name + " - " + this.page;
    }
}

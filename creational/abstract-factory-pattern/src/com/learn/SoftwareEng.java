package com.learn;

public final class SoftwareEng extends Employee {

    public SoftwareEng(Location location) {
        super(location, Designation.SE);
        this.hire();
    }

    @Override
    public void hire() {
        System.out.println("Hiring software engineer at:- " + this.getLocation());
    }
}

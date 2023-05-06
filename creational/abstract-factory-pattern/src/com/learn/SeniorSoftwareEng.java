package com.learn;

public final class SeniorSoftwareEng extends Employee {

    public SeniorSoftwareEng(Location location) {
        super(location, Designation.SSE);
        this.hire();
    }

    @Override
    public void hire() {
        System.out.println("Hiring senior software engineer at:- " + this.getLocation());
    }
}

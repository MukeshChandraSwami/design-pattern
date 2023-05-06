package com.learn;

public final class LeadEng extends Employee {

    public LeadEng(Location location) {
        super(location, Designation.LEAD);
    }

    @Override
    public void hire() {
        System.out.println("Hiring lead engineer at:- " + this.getLocation());
    }
}

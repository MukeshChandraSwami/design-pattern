package com.learn;

public abstract sealed class Employee permits LeadEng, SeniorSoftwareEng, SoftwareEng {

    private final Location location;
    private final Designation designation;

    public Employee( Location location, Designation designation) {
        this.location = location;
        this.designation = designation;
    }


    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return """
                {
                    "Location" : "%s",
                    "Designation" : "%s"
                }
                """.formatted(this.location, this.designation);
    }

    public abstract void hire();
}

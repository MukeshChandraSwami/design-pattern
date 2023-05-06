package com.learn;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        Employee se = EmployeeHiringFactory.hire(Designation.SE, Location.DELHI);
        System.out.println(se);
        Employee sse = EmployeeHiringFactory.hire(Designation.SSE, Location.NOIDA);
        System.out.println(sse);
        Employee lead = EmployeeHiringFactory.hire(Designation.LEAD, Location.GURGAON);
        System.out.println(lead);
    }
}

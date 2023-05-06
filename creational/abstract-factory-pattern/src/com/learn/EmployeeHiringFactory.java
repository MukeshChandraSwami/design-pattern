package com.learn;

import static com.learn.Location.DELHI;
import static com.learn.Location.GURGAON;
import static com.learn.Location.NOIDA;

public final class EmployeeHiringFactory {

    private EmployeeHiringFactory() {}

    // We can write logic for location but passing as an argument for now.
    public static Employee hire(Designation designation, Location location) {

        return switch (location) {

            case DELHI -> DelhiEmpFactory.empFactory(designation);
            case NOIDA -> NoidaEmpFactory.empFactory(designation);
            case GURGAON -> GGNEmpFactory.empFactory(designation);
        };
    }

    private static final class DelhiEmpFactory {

        public static Employee empFactory(Designation designation) {
            return switch (designation) {

                case SE -> new SoftwareEng(DELHI);
                case SSE -> new SeniorSoftwareEng(DELHI);
                case LEAD -> new LeadEng(DELHI);
            };
        }
    }

    private static final class NoidaEmpFactory {

        public static Employee empFactory(Designation designation) {
            return switch (designation) {

                case SE -> new SoftwareEng(NOIDA);
                case SSE -> new SeniorSoftwareEng(NOIDA);
                case LEAD -> new LeadEng(NOIDA);
            };
        }
    }

    private static final class GGNEmpFactory {

        public static Employee empFactory(Designation designation) {
            return switch (designation) {

                case SE -> new SoftwareEng(GURGAON);
                case SSE -> new SeniorSoftwareEng(GURGAON);
                case LEAD -> new LeadEng(GURGAON);
            };
        }
    }
}

public class Main {

    static class Employee {
        private String firstName;
        private String lastName;
        private String sSNum;

        public Employee(String first, String last, String ssn) {
            firstName = first;
            lastName = last;
            sSNum = ssn;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + "\nSSN: " + sSNum;
        }
    }

    static class CommissionEmployee extends Employee {
        private double grossSales;
        private double commissionRate;

        public CommissionEmployee(String firstName, String lastName,
                                  String ssn, double gS, double cR) {
            super(firstName, lastName, ssn);
            grossSales = gS;
            commissionRate = cR;
        }

        public double earnings() {
            return grossSales * commissionRate;
        }

        @Override
        public String toString() {
            return super.toString() +
                   "\nGross Sales : " + grossSales +
                   "\nCommission Rate : " + commissionRate;
        }
    }

    static class BasePlusCommissionEmployee extends CommissionEmployee {
        private double baseSalary;

        public BasePlusCommissionEmployee(String firstN, String lastN,
                String ssn, double gS, double cR, double bS) {
            super(firstN, lastN, ssn, gS, cR);
            baseSalary = bS;
        }

        public double earnings() {
            return super.earnings() + baseSalary;
        }

        @Override
        public String toString() {
            return super.toString() + "\nBase Salary: " + baseSalary;
        }
    }

    public static void main(String[] args) {

        CommissionEmployee emp1 =
                new CommissionEmployee("Harry", "Potter",
                        "47575-83737", 4556, 1.3);

        BasePlusCommissionEmployee emp2 =
                new BasePlusCommissionEmployee("Faris", "Ghazi",
                        "455-232323", 9000, 3.5, 566);

        System.out.println("Commission Employee");
        System.out.println(emp1);
        System.out.println("Earnings: " + emp1.earnings());

        System.out.println("\nBase Plus Commission Employee");
        System.out.println(emp2);
        System.out.println("Earnings: " + emp2.earnings());
    }
}
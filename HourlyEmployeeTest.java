class Employee {
 private String firstName;
 private String lastName;
 private String sSNum;

 public Employee(String first, String last, String ssn) {
  firstName = first;
  lastName = last;
  sSNum = ssn;
 }

 public String getFirstName() {
  return firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public String getSocialSecurityNumber() {
  return sSNum;
 }

 @Override
 public String toString() {
  return String.format("%s %s\nSSN: %s",
          firstName, lastName, sSNum);
 }
}

class HourlyEmployee extends Employee {
 private double hours;
 private double wage;

 public HourlyEmployee(String firstName, String lastName,
 String ssn, double wage, double hours) {
  super(firstName, lastName, ssn);
  setWage(wage);
  setHours(hours);
 }

 public void setWage(double wage) {
  if (wage >= 0) {
   this.wage = wage;
  }
 }

 public double getWage() {
  return wage;
 }

 public void setHours(double hours) {
  if (hours >= 0 && hours <= 168) {
   this.hours = hours;
  }
 }

 public double getHours() {
  return hours;
 }

 public double earnings() {
  if (hours <= 40) {
   return hours * wage;
  } else {
   return (40 * wage) + ((hours - 40) * wage * 1.5);
  }
 }

 @Override
 public String toString() {
  return String.format("%s\nHourly Wage: %.2f; Hours Worked: %.2f; Earnings: %.2f",
   super.toString(), wage, hours, earnings());
 }
}

public class HourlyEmployeeTest {
 public static void main(String[] args) {
  HourlyEmployee employee =
   new HourlyEmployee("Harry", "Potter", "4837436438", 43, 112);

  System.out.println(employee);
 }
}
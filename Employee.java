package pl.java.salarytask.entities;

import java.util.Calendar;
import java.util.Objects;

public class Employee {
    private static int BASE_SALARY = 3000;
    private static int ANNUAL_SALARY_INCREASE = 1000;

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int pesel;
    private int workStartYear;
    private int salary;

    public Employee(String firstName, String lastName, String address, String email, int pesel, int workStartYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.workStartYear = workStartYear;
        this.salary = 0;
    }

    public static int getBaseSalary() {
        return BASE_SALARY;
    }

    public static int getAnnualSalaryIncrease() {
        return ANNUAL_SALARY_INCREASE;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getWorkStartYear() {
        return workStartYear;
    }

    public void setWorkStartYear(int workStartYear) {
        this.workStartYear = workStartYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int calculateSalary() {
        // Only for Java versions higher than 8.
        // For version 8 use:
        // Year.now().getValue();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return BASE_SALARY + ANNUAL_SALARY_INCREASE * (currentYear - workStartYear);
    }

    protected void increaseSalary(int amount) {
        this.salary += amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return pesel == employee.pesel &&
               workStartYear == employee.workStartYear &&
               salary == employee.salary &&
               firstName.equals(employee.firstName) &&
               lastName.equals(employee.lastName) &&
               address.equals(employee.address) &&
               email.equals(employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, email, pesel, workStartYear, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", address='" + address + '\'' +
               ", email='" + email + '\'' +
               ", pesel=" + pesel +
               ", workStartYear=" + workStartYear +
               ", salary=" + salary +
               '}';
    }
}

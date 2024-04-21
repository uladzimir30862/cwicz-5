package pl.java.salarytask.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Tester extends Employee {
    private static int SALARY_INCREASE_PER_TEST_TYPE = 300;

    private ArrayList<String> testTypesList = new ArrayList<>();

    public Tester(String firstName, String lastName, String address, String email, int pesel, int workStartYear) {
        super(firstName, lastName, address, email, pesel, workStartYear);
    }

    public static int getSalaryIncreasePerTestType() {
        return SALARY_INCREASE_PER_TEST_TYPE;
    }

    public ArrayList<String> getTestTypesList() {
        return testTypesList;
    }

    public void setTestTypesList(ArrayList<String> testTypesList) {
        this.testTypesList = testTypesList;
    }

    public void addTestType(String testType) {
        if (!testTypesList.contains(testType)) {
            testTypesList.add(testType);
        }
    }

    @Override
    public int calculateSalary() {
        super.setSalary(super.calculateSalary());
        for (int i = 0; i < testTypesList.size(); i++) {
            super.increaseSalary(SALARY_INCREASE_PER_TEST_TYPE);
        }
        return getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tester tester)) return false;
        if (!super.equals(o)) return false;
        return testTypesList.equals(tester.testTypesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), testTypesList);
    }

    @Override
    public String toString() {
        return "Tester{" +
               "testTypesList=" + testTypesList +
               '}';
    }
}

package pl.java.salarytask.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Developer extends Employee {
    private ArrayList<Technology> technologies = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, int pesel, int workStartYear) {
        super(firstName, lastName, address, email, pesel, workStartYear);
    }

    public ArrayList<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(ArrayList<Technology> technologies) {
        this.technologies = technologies;
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public int calculateSalary() {
        super.setSalary(super.calculateSalary());
        for (Technology technology : technologies) {
            super.increaseSalary(technology.getSalaryRise());
        }
        return getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer developer)) return false;
        if (!super.equals(o)) return false;
        return technologies.equals(developer.technologies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), technologies);
    }

    @Override
    public String toString() {
        return "Developer{" +
               "technologies=" + technologies +
               '}';
    }
}

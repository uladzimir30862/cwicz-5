package pl.java.salarytask.entities;

import java.util.Objects;

public class Technology {
    private String technologyName;
    private int salaryRise;

    public Technology(String technologyName, int salaryRise) {
        this.technologyName = technologyName;
        this.salaryRise = salaryRise;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public int getSalaryRise() {
        return salaryRise;
    }

    public void setSalaryRise(int salaryRise) {
        this.salaryRise = salaryRise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Technology that)) return false;
        return salaryRise == that.salaryRise &&
               technologyName.equals(that.technologyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(technologyName, salaryRise);
    }

    @Override
    public String toString() {
        return "Technology{" +
               "technologyName='" + technologyName + '\'' +
               ", salaryRise=" + salaryRise +
               '}';
    }
}

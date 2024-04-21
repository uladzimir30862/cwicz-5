package pl.java.salarytask.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Manager extends Employee {
    private ArrayList<Goal> goalArrayList = new ArrayList<>();

    public Manager(String firstName, String lastName, String address, String email, int pesel, int workStartYear) {
        super(firstName, lastName, address, email, pesel, workStartYear);
    }

    public ArrayList<Goal> getGoalArrayList() {
        return goalArrayList;
    }

    public void setGoalArrayList(ArrayList<Goal> goalArrayList) {
        this.goalArrayList = goalArrayList;
    }

    public void addGoals(Goal goal) {
        if (!goalArrayList.contains(goal)) {
            goalArrayList.add(goal);
        }
    }

    public void setGoalDone(Goal goal) {
        if (goalArrayList.contains(goal)) {
            goal.setReady(true);
        } else {
            System.out.println("No such goal in list");
        }
    }

    @Override
    public int calculateSalary() {
        super.setSalary(super.calculateSalary());
        for (Goal goal : goalArrayList) {
            if (goal.isReady()) {
                super.increaseSalary(goal.getSalaryRise());
            }
        }
        return super.getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        if (!super.equals(o)) return false;
        return goalArrayList.equals(manager.goalArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), goalArrayList);
    }

    @Override
    public String toString() {
        return "Manager{" +
               "goalArrayList=" + goalArrayList +
               '}';
    }
}

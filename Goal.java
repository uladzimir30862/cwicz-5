package pl.java.salarytask.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Goal {
    private LocalDate goalDate;
    private String goalTask;
    private int salaryRise;
    private boolean isReady = false;

    public Goal(LocalDate goalDate, String goalTask, int salaryRise) {
        this.goalDate = goalDate;
        this.goalTask = goalTask;
        this.salaryRise = salaryRise;
    }

    public Goal(int year, int month, int day, String goalTask, int salaryRise) {
        this.goalDate = LocalDate.of(year, month, day);
        this.goalTask = goalTask;
        this.salaryRise = salaryRise;
    }

    public LocalDate getGoalDate() {
        return goalDate;
    }

    public void setGoalDate(LocalDate goalDate) {
        this.goalDate = goalDate;
    }

    public String getGoalTask() {
        return goalTask;
    }

    public void setGoalTask(String goalTask) {
        this.goalTask = goalTask;
    }

    public int getSalaryRise() {
        return salaryRise;
    }

    public void setSalaryRise(int salaryRise) {
        this.salaryRise = salaryRise;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goal goal)) return false;
        return salaryRise == goal.salaryRise &&
               isReady == goal.isReady &&
               goalDate.equals(goal.goalDate) &&
               goalTask.equals(goal.goalTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goalDate, goalTask, salaryRise, isReady);
    }

    @Override
    public String toString() {
        return "Goal{" +
               "goalDate=" + goalDate +
               ", goalTask='" + goalTask + '\'' +
               ", salaryRise='" + salaryRise + '\'' +
               ", isReady=" + isReady +
               '}';
    }
}

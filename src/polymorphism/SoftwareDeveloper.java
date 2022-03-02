package polymorphism;

import java.util.Date;

public class SoftwareDeveloper extends Employee {
    private String specialty;
    private static final double BONUS_RATE = 0.5;

    public SoftwareDeveloper(String employeeId, long salary, Date startDate, String specialty) {
        super(employeeId, salary, startDate);
        this.specialty = specialty;
    }

    @Override
    public void work() {
        System.out.println("I'm coding... all day long");
    }

    @Override
    public long getSalary() {
        return super.getSalary() + Math.round(super.getSalary() * BONUS_RATE);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "SoftwareDeveloper{" +
                "specialty='" + specialty + '\'' +
                '}';
    }
}

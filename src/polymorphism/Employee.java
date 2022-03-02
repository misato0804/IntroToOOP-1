package polymorphism;

import java.util.Date;

public class Employee {
    // instance variables
    private String employeeId;
    private long salary;
    private Date startDate;

    // constructor
    public Employee(String employeeId, long salary, Date startDate) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.startDate = startDate;
    }

    public void work() {
        System.out.println("EmployeeID: " + employeeId + " is working!");
    }

    public Date getStartDate() {
        return startDate;
    }

    public long getSalary() {
        return salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                '}';
    }
}

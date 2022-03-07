package polymorphism;

import java.util.Date;

// Abstract class
// - can not be instantiated.
// - can have abstract methods.
// - subclasses MUST implement all abstract methods.
public abstract class Employee {
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

    public abstract void work();

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

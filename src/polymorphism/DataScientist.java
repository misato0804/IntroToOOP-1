package polymorphism;

import java.util.Date;

public class DataScientist extends Employee {
    private String databaseCode;

    public DataScientist(String employeeId, long salary, Date startDate, String databaseCode) {
        super(employeeId, salary, startDate);
        this.databaseCode = databaseCode;
    }

    @Override
    public void work() {
        System.out.println("I'm working with lots of data to analyze the product.");
    }

    public String getDatabaseCode() {
        return databaseCode;
    }

    public void setDatabaseCode(String databaseCode) {
        this.databaseCode = databaseCode;
    }

    @Override
    public String toString() {
        return "DataScientist{" +
                "databaseCode='" + databaseCode + '\'' +
                '}';
    }
}

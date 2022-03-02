package polymorphism;

import java.util.Date;

// Polymorphism: same type, different behaviors
// Inheritance -> Override methods -> Polymorphic objects
public class Driver {
    public static void main(String[] args) {
        Employee sd1 = new SoftwareDeveloper("S12", 70000, new Date(), "Java");
        Employee d1 = new Designer("D11", 70000, new Date(), true);
        Employee pm1 = new ProductManager("P10", 70000, new Date(), "AC123");
        Employee ds1 = new DataScientist("DS7", 70000, new Date(), "abc123");

        // I want to know sd1's specialty
        // Compile-time: Java thinks sd1 is a type of Employee
        // Run-time: Because sd1 is actually a SoftwareDeveloper type,
        //           we can down-cast sd1 to SoftwareDeveloper
        System.out.println(((SoftwareDeveloper) sd1).getSpecialty());

        // Polymorphism -> same type, different behaviors (different forms of work method)
        Employee[] employees = {sd1, d1, pm1, ds1};
        // System.out.println(((SoftwareDeveloper) employees[1]).getSpecialty()); -> Runtime Exception

        int totalSalary = 0;
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
            totalSalary += employee.getSalary();
            System.out.println(employee);
            employee.work();
        }

        System.out.println("Total Salary: " + totalSalary);
    }
}

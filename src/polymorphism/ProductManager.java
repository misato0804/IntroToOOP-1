package polymorphism;

import java.util.Date;

public class ProductManager extends Employee {
    private String productCode;

    public ProductManager(String employeeId, long salary, Date startDate, String productCode) {
        super(employeeId, salary, startDate);
        this.productCode = productCode;
    }

    @Override
    public void work() {
        System.out.println("I'm managing the product and the team.");
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "productCode='" + productCode + '\'' +
                '}';
    }
}

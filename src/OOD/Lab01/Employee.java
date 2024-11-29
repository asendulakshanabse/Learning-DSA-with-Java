package OOD.Lab01;

public class Employee {
    private String employeeID;
    private String employeeName;
    private double basicSalary;

    public Employee (String employeeID, String employeeName, double basicSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public String getEmployeeID() { return employeeID; }
    public String getEmployeeName() { return employeeName; }
    public double getBasicSalary() { return basicSalary; }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateAllowance() {
        return 0;
    }

    public double calculateNetPay() {
        return 0;
    }

}

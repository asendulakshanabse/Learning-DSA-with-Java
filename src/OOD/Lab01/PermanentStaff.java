package OOD.Lab01;

public class PermanentStaff extends Employee {
    private double allowance;
    private double tax;

    public PermanentStaff(String employeeID, String employeeName, double basicSalary, double allowance, double tax) {
        super(employeeID, employeeName, basicSalary);
        this.allowance = 0;
        this.tax = 0;

    }

    public double getAllowance() {
        return allowance;
    }
    public double getTax() {
        return tax;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double calculateTax() {
        return getBasicSalary() * 0.1;
    }
    @Override
    public double calculateAllowance() {
        return getBasicSalary() * 0.25;
    }

    @Override
    public double calculateNetPay() {
        return getBasicSalary() + calculateAllowance() - calculateTax();
    }


}

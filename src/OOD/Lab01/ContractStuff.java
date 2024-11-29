package OOD.Lab01;

public class ContractStuff extends Employee {
    private double allowance;

    public ContractStuff(String employeeID, String employeeName, double basicSalary, double allowance) {
        super(employeeID, employeeName, basicSalary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }


    @Override
    public double calculateAllowance() {
        return getBasicSalary() * 0.15;
    }

    @Override
    public double calculateNetPay() {
        return getBasicSalary() + calculateAllowance();
    }
}

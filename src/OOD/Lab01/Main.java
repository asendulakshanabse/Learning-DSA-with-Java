package OOD.Lab01;

public class Main {
    public static void main(String[] args) {
        PermanentStaff permanentStaff01 = new PermanentStaff("P1OO1", "Kumara", 90000.0, 0, 0);
        ContractStuff contractStuff01 = new ContractStuff("C2001", "Fernando", 40000, 0);
        PartTimeStaff partTimeStaff01 = new PartTimeStaff("PT3001", "Perera", 20000, 0);

        System.out.println("Employee Name (Permanent Staff): " + permanentStaff01.getEmployeeName());
        System.out.println("Basic Salary (Permanent Staff): " + permanentStaff01.getBasicSalary());

        permanentStaff01.setEmployeeName("Kumara Sangakkara");
        System.out.println("Updated Employee Name (Permanent Staff): " + permanentStaff01.getEmployeeName());

        permanentStaff01.setBasicSalary(95000);
        System.out.println("Updated Basic Salary (Permanent Staff): " + permanentStaff01.getBasicSalary());

        System.out.println("Net pay of Permanent Staff Kumara Sangakkara: " + permanentStaff01.calculateNetPay());

        partTimeStaff01.setBasicSalary(25000);
        System.out.println("Updated Basic Salary (Part-time Staff): " + partTimeStaff01.getBasicSalary());

        System.out.println("Updated Net Pay Part-Time Staff Perera: " + partTimeStaff01.calculateNetPay());

    }
}

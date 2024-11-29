package OOP.Tutorial;

class Employee {
    String name;
    static String managerName;

    public void display() {
        System.out.println("employee name: " + this.name);
        System.out.println("manager name: " + managerName);
    }


}
public class StaticVariables {
    public static void main(String[] args) {
        Employee.managerName = "Ashen Dulakshana";

        Employee e1 = new Employee();
        e1.name = "Kalpana";

        Employee e2 = new Employee();
        e2.name = "Udara";

        e1.display();
        e2.display();





    }
}

package OOP.Tutorial;

class Emp {
    String name;
    static int workingTime;
    static String managerName;

    public static void showWorkingTime() {
        System.out.println("working hours: " + workingTime);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Emp.workingTime = 10;

        Emp emp = new Emp();
        Emp.showWorkingTime();



    }


}
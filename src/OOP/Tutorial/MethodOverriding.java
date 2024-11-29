package OOP.Tutorial;

class PersonCls {
    public void display() {
        System.out.println("this is from person class");
    }
}

class StudentCls extends PersonCls {

    @Override
    public void display() {
        System.out.println("this is from student class");
    }
}




public class MethodOverriding {
    public static void main(String[] args) {
        StudentCls std1 = new StudentCls();
        std1.display();
    }
}

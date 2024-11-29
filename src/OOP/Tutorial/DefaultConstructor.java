package OOP.Tutorial;
class Student {
    String stdName;
    int stdID;
    int numOfSubjects;
    String stdEmail;

    // String stdName, int stdID, int numOfSubjects, String stdEmail

    public Student() {
        this.stdName = "default name";
        this.stdID = 0;
        this.numOfSubjects = 0;
        this.stdEmail = "stdEmail@gmail.com";
    }

    public void showStdDetails() {
        System.out.println("name: " + this.stdName);
        System.out.println("id: " + this.stdID);
        System.out.println("num of subject: " + this.numOfSubjects);
        System.out.println("email: " + this.stdEmail);
    }

}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showStdDetails();
    }


}

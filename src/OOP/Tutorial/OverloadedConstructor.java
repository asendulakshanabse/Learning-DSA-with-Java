package OOP.Tutorial;

class Students {
    String stdName;
    int stdID;
    int numOfSubjects;
    String stdEmail;

    public Students(String stdName, int stdID, int numOfSubjects, String stdEmail) {
        this.stdName = stdName;
        this.stdID = stdID;
        this.numOfSubjects = numOfSubjects;
        this.stdEmail = stdEmail;
    }

    public void showStdDetails() {
        System.out.println("name: " + this.stdName);
        System.out.println("id: " + this.stdID);
        System.out.println("num of subject: " + this.numOfSubjects);
        System.out.println("email: " + this.stdEmail);
    }

}

public class OverloadedConstructor {
    public static void main(String[] args) {
        Students s1 = new Students("Kavinda", 2, 3, "email");
        s1.showStdDetails();
    }
}



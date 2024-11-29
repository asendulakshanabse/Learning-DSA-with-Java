package OOP;

public class Student {
    int id;
    String name;
    String major;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", id: " + this.getId() + ", major: " + this.getMajor();
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "asen", "a");

        System.out.println(s1.toString());

    }

}

package Lesson12;

public class Student extends Person1 {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }
    public String getName() {
        return "Student's name is " + super.name;
    }
}

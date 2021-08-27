package lessons.Lesson11;

public class Student {
    private Subjects[] subjects;
    private String name;
    private Subjects major;

    public Student(Subjects[] subjects, String name, Subjects major) {
        this.subjects = subjects;
        this.name = name;
        this.major = major;
    }
}

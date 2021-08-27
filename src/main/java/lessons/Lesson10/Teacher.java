package lessons.Lesson10;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String lastName, int yearOfBirth, String subject) {
        super(name,lastName,yearOfBirth);
        this.subject = subject;
    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }
}

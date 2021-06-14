package Lesson10;

public class TempTeacher extends Teacher {
    private String month;

    public TempTeacher(String name, String lastName, int yearOfBirth, String subject, String month) {
        super(name, lastName, yearOfBirth, subject);
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}

package Lesson10;

public final class Student extends Person {
    private String schoolName;
    private String major;

    public Student(String name, String lastName, int yearOfBirth, String schoolName, String major) {
        super(name,lastName,yearOfBirth);
        this.schoolName = schoolName;
        this.major = major;
    }

    public Student() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

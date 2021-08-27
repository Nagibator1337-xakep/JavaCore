package homework.homeWork14;

import java.io.Serializable;

public class Job implements Serializable {
    private String title;
    private int salary;

    public Job() {
    }

    public Job(String title, int salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{\"Job\": {" +
                "\"title\": \"" + title + '\"' +
                ", \"salary\": \"" + salary + '\"' +
                "}}";
    }
}

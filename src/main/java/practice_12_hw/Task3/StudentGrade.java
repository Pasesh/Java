package practice_12_hw.Task3;

import java.util.Objects;

public class StudentGrade<T extends Number> {
    private String name;
    private Subject subject;
    private T grade;

    public StudentGrade(String name, Subject subject, T grade) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade<?> that = (StudentGrade<?>) o;
        return Objects.equals(name, that.name) && subject == that.subject && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subject, grade);
    }
}

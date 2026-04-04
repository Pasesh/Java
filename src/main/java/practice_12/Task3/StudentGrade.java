package practice_12.Task3;

public class StudentGrade<T extends Number> {//Внутри StudentGrade есть оценка типа T, и этот T обязан быть числом
    //Дженерик <T> объявляется: либо на уровне класса, либо на уровне метода, А у поля так нельзя
    private String name;
    private Subject subject;
    private T grade;

    public StudentGrade(String name, Subject subject, T grade){
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
}

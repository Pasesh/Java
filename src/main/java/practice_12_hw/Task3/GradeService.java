package practice_12_hw.Task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService <T extends Number>{

    List<StudentGrade<T>> studentGrades = new ArrayList<>();

    public List<StudentGrade<T>> getStudentGrades() {
        return studentGrades;
    }
    public void addGrade(StudentGrade<T> studentGrade){
        T grade = studentGrade.getGrade();
        if(grade.doubleValue() < 0){
            throw  new InvalidGradeException("Оценка не может быть отрицательной");
        }
        studentGrades.add(studentGrade);
    }

    public double calculateAverageBySubject(Subject subject){
        return studentGrades.stream()
                .filter(g -> g.getSubject() == subject)
                .mapToDouble(g -> g.getGrade().doubleValue())
                .average()
                .orElse(0);
    }
}

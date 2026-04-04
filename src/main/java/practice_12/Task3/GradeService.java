package practice_12.Task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {//Потому что T в GradeService — это тоже тип оценки, а не тип студента.


    public List<StudentGrade<T>> getAllGrades() {
        return studentGradeList;
    }

    private final List<StudentGrade<T>> studentGradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> studentGrade){
        if(studentGrade.getGrade().doubleValue() < 0){//doubleValue(), приводим к примитиву и используем для сравнения
            throw new InvalidGradeException("Оценка не может быть отрицательной");
        }
        studentGradeList.add(studentGrade);
    }

    public synchronized  double calculateAverageBySubject(Subject subject){
        return studentGradeList.stream()
                .filter(sg -> sg.getSubject() == subject)//== потому что это enum + sg(элемент StudentGrade)
                .mapToDouble(sg ->sg.getGrade().doubleValue())//превращаем в double, для того что бы использовать .average()
                .average()
                .orElse(0);// average, может ничего не вернуть
    }
}

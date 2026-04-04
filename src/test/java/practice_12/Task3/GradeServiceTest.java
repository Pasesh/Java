package practice_12.Task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {//Мы работаем со студентами,
    //а T описывает, какого типа у них оценка
    private GradeService<Integer> service;
    private StudentGrade<Integer> math1;
    private StudentGrade<Integer> math2;
    private StudentGrade<Integer> art1;
    private StudentGrade<Integer> negativeGrade;


    @BeforeEach
    public void setUp() {
        service = new GradeService<>();

        math1 = new StudentGrade<>("Ann", Subject.MATH, 7);
        math2 = new StudentGrade<>("Bob", Subject.MATH, 9);
        art1 = new StudentGrade<>("Kate", Subject.ART, 5);
        negativeGrade = new StudentGrade<>("Max", Subject.MATH, -2);
    }

    @Test
    public void shouldAddGrade() {
        service.addGrade(math1);
        assertEquals(1, service.getAllGrades().size());
        assertEquals(math1,service.getAllGrades().getFirst());
    }

    @Test
    public void shouldThrowExceptionForNegativeGrade(){
        assertThrows(InvalidGradeException.class,
                ()-> service.addGrade(negativeGrade));
    }
    @Test
    public void shouldCalculateAverageGradeBySubject(){
        service.addGrade(math1);
        service.addGrade(math2);
        service.addGrade(art1);
        double actualResult = service.calculateAverageBySubject(Subject.MATH);
        assertEquals(8.0, actualResult);
    }

    @Test
    public void shouldReturnZeroWhenSubjectHasNoGrades() {
        service.addGrade(art1);
        double actualResult = service.calculateAverageBySubject(Subject.MATH);
        assertEquals(0.0, actualResult);
    }

    @Test
    void shouldCalculateAverageForDoubleGrades() {
        GradeService<Double> service = new GradeService<>();

        service.addGrade(new StudentGrade<>("Ann", Subject.MATH, 7.5));
        service.addGrade(new StudentGrade<>("Bob", Subject.MATH, 8.5));

        double result = service.calculateAverageBySubject(Subject.MATH);

        assertEquals(8.0, result);
    }


}

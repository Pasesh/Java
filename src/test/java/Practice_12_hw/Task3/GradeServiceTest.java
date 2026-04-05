package Practice_12_hw.Task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_12_hw.Task3.GradeService;
import practice_12_hw.Task3.InvalidGradeException;
import practice_12_hw.Task3.StudentGrade;
import practice_12_hw.Task3.Subject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {
    private GradeService<Integer> service;
    private StudentGrade<Integer> math1;
    private StudentGrade<Integer> math2;
    private StudentGrade<Integer> art1;
    private StudentGrade<Integer> negativeGrade;

    @BeforeEach
    public void setUp(){
        service = new GradeService<>();
        math1 = new StudentGrade<>("Anna", Subject.MATH, 7);
        math2 = new StudentGrade<>("Oleg", Subject.MATH, 9);
        art1 = new StudentGrade<>("Ivan", Subject.ART, 5);
        negativeGrade = new StudentGrade<>("Liza", Subject.ART, -5);
    }

    @Test
    public void shouldAddGrade(){

        int initialSize = service.getStudentGrades().size();
        service.addGrade(math1);
        assertEquals(initialSize + 1, service.getStudentGrades().size());
        assertEquals(new StudentGrade<>("Anna", Subject.MATH, 7),service.getStudentGrades().getFirst());
    }

    @Test
    public void shouldThrowExceptionForNegativeGrade(){
        assertThrows(InvalidGradeException.class, () -> {
            service.addGrade(negativeGrade);
        });
    }

    @Test
    public void shouldCalculateAverageBySubject(){
        service.addGrade(math2);
        service.addGrade(math1);
        service.addGrade(art1);

        double result = service.calculateAverageBySubject(Subject.MATH);
        assertEquals(8.0 , result);
    }

    @Test
    public void shouldReturnZeroWhenSubjectHasNoGrades(){

        service.addGrade(art1);
        double result = service.calculateAverageBySubject(Subject.MATH);

        assertEquals(0.0 , result);
    }

    @Test
    public void shouldCalculateAverageForDoubleGrades(){

        GradeService<Double> service = new GradeService<>();

        service.addGrade(new StudentGrade<>("Anna", Subject.MATH, 7.5));
        service.addGrade(new StudentGrade<>("Bob", Subject.MATH, 9.5));

        double result = service.calculateAverageBySubject(Subject.MATH);

        assertEquals(8.5 , result);
    }


}

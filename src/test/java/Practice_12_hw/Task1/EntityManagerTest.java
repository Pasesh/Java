package Practice_12_hw.Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import practice_12_hw.Task1.EntityManager;
import practice_12_hw.Task1.Student;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    private EntityManager<Student> manager;
    private Student activeStudent;
    private Student inactiveStudent;

    @BeforeEach
    public void setUp(){
        manager = new EntityManager<>();
        activeStudent = new Student("Max", 25, true);
        inactiveStudent = new Student("Anna", 21, false);
    }

    static Stream<Arguments> ageData(){
        return Stream.of(
                Arguments.of(20, 30, 2),
                Arguments.of(21, 21, 1),
                Arguments.of(0, 18, 0),
                Arguments.of(24, 25, 1)
        );
    }

    static Stream<Arguments> nameData(){
        return Stream.of(
                Arguments.of("Max", 1),
                Arguments.of("Anna", 1),
                Arguments.of("Albert", 0)
        );
    }

    static Stream<Arguments> activeData(){
        return Stream.of(
                Arguments.of(true, new Student("Max", 25, true)),
                Arguments.of(false, new Student("Anna", 21, false))
        );
    }
    @Test
    public void shouldAddEntity(){
        int initialSize = manager.getAll().size();
        manager.addEntity(activeStudent);

        Student result  = manager.getAll().getFirst();

        assertTrue(manager.getAll().contains(activeStudent));
        assertEquals(initialSize + 1, manager.getAll().size());
        assertEquals(new Student("Max", 25, true), result);

    }

    @Test
    public void shouldRemoveExistingEntity(){

        int initialSize = manager.getAll().size();
        manager.addEntity(activeStudent);

        assertTrue(manager.removeEntity(activeStudent));
        assertEquals(initialSize, manager.getAll().size());
        assertFalse(manager.getAll().contains(activeStudent));
    }

    @Test
    public void shouldReturnFalseWhenRemovingMissingEntity(){

        int initialSize = manager.getAll().size();

        assertFalse(manager.removeEntity(activeStudent));
        assertEquals(initialSize, manager.getAll().size());
        assertFalse(manager.getAll().contains(activeStudent));
    }

    @Test
    public void shouldReturnAllEntities(){

        int initialSize = manager.getAll().size();
        manager.addEntity(activeStudent);
        manager.addEntity(inactiveStudent);


        assertEquals(initialSize + 2, manager.getAll().size());
        assertTrue(manager.getAll().contains(activeStudent));
        assertTrue(manager.getAll().contains(inactiveStudent));
    }

    @Test
    public void shouldReturnUnmodifiableList(){
        manager.addEntity(inactiveStudent);
        assertThrows(UnsupportedOperationException.class, () ->{
            manager.getAll().add(activeStudent);
        });
    }

    @ParameterizedTest
    @MethodSource("ageData")
    public void shouldFilterByAge(int min, int  max, int size){
        manager.addEntity(activeStudent);
        manager.addEntity(inactiveStudent);

        List<Student> result = manager.filterByAge(min, max);

        assertEquals(size, result.size());
    }

    @ParameterizedTest
    @MethodSource("nameData")
    public void shouldFilterByName(String name, int size){
        manager.addEntity(activeStudent);
        manager.addEntity(inactiveStudent);

        List<Student> result = manager.filterByName(name);

        assertEquals(size, result.size());
    }

    @ParameterizedTest
    @MethodSource("activeData")
    public void shouldFilterByActivityStatus(boolean isActive, Student student){
        manager.addEntity(activeStudent);
        manager.addEntity(inactiveStudent);

        List<Student> result = manager.filterByActive(isActive);
        assertEquals(1, result.size());
        assertTrue(result.contains(student));
    }


}

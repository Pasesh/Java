package practice_12.Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {

    private EntityManager<Student> manager;
    private Student activeStudent;
    private Student inactiveStudent;

    @BeforeEach
    void setUp() {
        manager = new EntityManager<>();
        activeStudent = new Student("Lola", 35, true);
        inactiveStudent = new Student("Anna", 18, false);

    }

    static Stream<Arguments> ageData() {
        return Stream.of(
                Arguments.of(15, 40, 2),
                Arguments.of(18, 18, 1),
                Arguments.of(10, 15, 0),
                Arguments.of(15, 20, 1)
        );
    }

    static Stream<Arguments> nameData() {
        return Stream.of(
                Arguments.of("Anna", 1),
                Arguments.of("Lola", 1),
                Arguments.of("Albert", 0)
        );
    }

    static Stream<Arguments> activeData() {
        return Stream.of(
                Arguments.of(true, new Student("Lola", 35, true)),//значение ожидаемые таки же как и в BeforeEach
                Arguments.of(false, new Student("Anna", 18, false))
        );
    }

    //!!В коллекциях всегда должна быть проверка на длину
    //!!Не забывать проверять на переопределение equals и hashCode
    @Test
    public void shouldAddEntity() {//хранилище студентов

        int initialSize = manager.getAll().size();//берём текущее количество элементов в списке
        manager.addEntity(activeStudent);//добавить элемент

        assertTrue(manager.getAll().contains(activeStudent));// элемент содержится в финальном списке

        Student actualStudent = manager.getAll().getFirst();//берем первый элемент из списка, ожидаем, что это и есть activeStudent

        assertEquals(activeStudent.hashCode(), actualStudent.hashCode()); //проверка hashCode
        assertEquals(new Student("Lola", 35, true), actualStudent); // проверка equals (проверка разных объектов)
        assertEquals(initialSize + 1, manager.getAll().size());//размер стал на 1 элемент больше

    }

    @Test
    public void shouldRemoveExistingEntity() {
        manager.addEntity(activeStudent);
        int initialSize = manager.getAll().size();// изначальный размер
        assertTrue(manager.removeEntity(activeStudent));//удаляем добавленный элемент и возвращаем true
        assertEquals(initialSize - 1, manager.getAll().size());// проверяем уменьшение длины на 1
        assertFalse(manager.getAll().contains(activeStudent));//проверяем остался ли удаленный элемент в списке
    }

    @Test
    public void shouldReturnFalseWhenRemovingMissingEntity() {
        int initialSize = manager.getAll().size();// изначальный размер
        boolean actualResult = manager.removeEntity(inactiveStudent);//удаляем несуществующий элемент и присваиваем в значение actualResult
        assertFalse(actualResult); //сравниваем actualResult с false
        assertEquals(initialSize, manager.getAll().size());//
        assertFalse(manager.getAll().contains(inactiveStudent));//этого объекта и не было
    }

    @Test
    public void shouldReturnAllEntities() {
        int initialSize = manager.getAll().size();// изначальный размер
        manager.addEntity(inactiveStudent);//добавляем 1 элемент
        manager.addEntity(activeStudent);//добавляем 2 элемент
        assertEquals(initialSize + 2, manager.getAll().size()); // проверяем что размер увеличен на 2
        assertTrue(manager.getAll().contains(inactiveStudent));//список содержит именно тот элемент1, который добавили
        assertTrue(manager.getAll().contains(activeStudent));//список содержит именно тот элемент2, который добавили
    }

    @Test
    public void shouldReturnUnmodifiableList() {
        manager.addEntity(inactiveStudent);//добавляем 1 элемент
        assertThrows(UnsupportedOperationException.class, () ->//операция не поддерживается, вызывается ошибка UnsupportedOperationException
                manager.getAll().add(activeStudent));//возвращается неизменяемый список(List.copyOf(entities);) и изменяем этот список
    }

    @ParameterizedTest
    @MethodSource("ageData")
    public void shouldFilterByAge(int min, int max, int expectedSize) { //передаем диапазон и ожидаемый размер
        manager.addEntity(activeStudent);
        manager.addEntity(inactiveStudent);

        List<Student> result = manager.filterByAge(min, max);
        assertEquals(expectedSize, result.size());// сравниваем ожидаемый размер и фактический
    }

    @Test
    public void shouldReturnOnlyEntitiesWithinAge() {
        manager.addEntity(activeStudent);
        manager.addEntity(inactiveStudent);

        List<Student> result = manager.filterByAge(15, 20);

        assertEquals(1, result.size());

        assertFalse(result.contains(activeStudent));
        assertTrue(result.contains(inactiveStudent));
    }

    @ParameterizedTest
    @MethodSource("nameData")
    public void shouldFilterByName(String name, int expectedSize) {
        manager.addEntity(activeStudent);
        manager.addEntity(inactiveStudent);
        List<Student> result = manager.filterByName(name);
        assertEquals(expectedSize, result.size());
    }

    @Test
    public void shouldReturnAllEntitiesWithSameName() {
        manager.addEntity(activeStudent);
        manager.addEntity(inactiveStudent);
        manager.addEntity(new Student("Lola", 20, false));

        List<Student> result = manager.filterByName("Lola");

        assertEquals(2, result.size());
        assertTrue(result.contains(activeStudent));
        assertFalse(result.contains(inactiveStudent));
    }

    @ParameterizedTest
    @MethodSource("activeData")
    public void shouldFilterByActivityStatus(boolean isActive, Student expectedStudent) {
        manager.addEntity(inactiveStudent);
        manager.addEntity(activeStudent);
        List<Student> result = manager.filterByActive(isActive);
        assertEquals(1, result.size());
        assertTrue(result.contains(expectedStudent));


    }
}


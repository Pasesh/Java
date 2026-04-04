package practice_12.Task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    private TaskService<Integer> service;
    private Task<Integer> task1;
    private Task<Integer> task2;
    private Task<Integer> task3;

    @BeforeEach
    public void setUp() {
        service = new TaskService<>();
        task1 = new Task<>(1, Status.TODO, Priority.LOW, new Date(1000));
        task2 = new Task<>(2, Status.IN_PROGRESS, Priority.HIGH, new Date(2000));
        task3 = new Task<>(3, Status.TODO, Priority.CRITICAL, new Date(3000));
    }

    @Test
    public void shouldAddTask() {


        int initialSize = service.getAll().size();

        service.addTask(task1);

        List<Task<Integer>> result = service.getAll();
        assertTrue(result.contains(task1));
        assertEquals(initialSize + 1, result.size());
    }

    @Test
    public void shouldThrowExceptionWhenIdIsDuplicate() {
        service.addTask(task1);
        assertThrows(IllegalArgumentException.class, () -> {//выполни этот код и убедись, что он выбросит исключение
            service.addTask(task1);
        });
    }

    @Test
    public void shouldRemoveTask() {

        int initialSize = service.getAll().size();
        service.addTask(task1);
        boolean result = service.removeTask(task1.getID());
        assertTrue(result);

        assertFalse(service.getAll().contains(task1));
        assertEquals(initialSize, service.getAll().size());
    }

    @Test
    public void shouldReturnFalseWhenTaskNotFound() {
        int initialSize = service.getAll().size();
        boolean result = service.removeTask(task1.getID());
        assertFalse(result);
        assertEquals(initialSize, service.getAll().size());
    }

    @Test
    public void shouldSortTasksByDate(){
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        List<Task<Integer>> result = service.filterTaskByStatus(Status.TODO);

        List<Task<Integer>> expected = List.of(
                task1, task3);
        assertEquals(expected, result);
    }


    @Test
    public void shouldFilterTaskByPriority(){
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        List<Task<Integer>> result = service.filterTaskByPriority(Priority.CRITICAL);
        List<Task<Integer>> expected = List.of(task3);

        assertEquals(expected, result);

    }

    @Test
    public void shouldSortedTaskByDate(){
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        List<Task<Integer>> result = service.sortedTaskByDate();
        List<Task<Integer>> expected = List.of(
                task3, task2, task1);

        assertEquals(expected, result);

    }


}

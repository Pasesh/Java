package practice_12.Task6;

import java.util.*;

import static java.util.List.copyOf;

public class TaskService<T> {
    List<Task<T>> tasks = new ArrayList<>();

    public List<Task<T>> getAll() {//вернуть копию списка всех объектов
        return List.copyOf(tasks);// делается что бы через этот методы нельзя было изменить entities
    }

    public synchronized void addTask(Task<T> task) {
        if (task == null) {
            throw new IllegalArgumentException("Task не может быть null");


        }
        T id = task.getID();
        if (id == null) {
            throw new IllegalArgumentException("ID пустой");
        }

        boolean exists = tasks.stream()
                .anyMatch(t -> Objects.equals(t.getID(), id));// проверяем, есть ли уже задача с таким id
        //Objects.equals(a, b) равен ли id текущей задачи нужному id?
        //(a == b) || (a != null && a.equals(b))
        if (exists) {
            throw new IllegalArgumentException("Задача с таким ID уже существует");
        }

        tasks.add(task);
    }

    public synchronized boolean removeTask(T id) {
        if (id == null) {
            throw new IllegalArgumentException("ID отсутствует");
        }
        Iterator<Task<T>> iterator = tasks.iterator(); // 2 вариант
        while (iterator.hasNext()) {
            Task<T> task = iterator.next();
            if (Objects.equals(task.getID(), id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Task<T>> filterTaskByStatus(Status status) {
        if (status == null) {
            throw new IllegalArgumentException("Status отсутствует");
        }
        return tasks.stream()
                .filter(t -> t.getStatus() == status) //enums можно сравнивать через == (не бывает “разных объектов с одинаковым значением”)
                .toList();
    }

    public List<Task<T>> filterTaskByPriority(Priority priority) {
        if (priority == null) {
            throw new IllegalArgumentException("Priority отсутствует");
        }
        return tasks.stream()
                .filter(t -> t.getPriority() == priority)
                .toList();
    }

    public List<Task<T>> sortedTaskByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task<T>::getDate).reversed())//t -> t.getDate() (Класс::метод)
                //reversed по убыванию (сначала новые задачи)
                /*
                берёт объект (Task)
                достаёт из него поле (Date)
                и сравнивает эти поля
                 */
                .toList();
    }
}

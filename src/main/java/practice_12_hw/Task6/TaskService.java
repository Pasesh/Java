package practice_12_hw.Task6;

import java.util.*;

public class TaskService <T>{

    List<Task<T>> tasks = new ArrayList<>();

    public List<Task<T>> getTasks() {
        return List.copyOf(tasks);
    }

    public synchronized void addTask(Task<T> task){
        if(task == null){
            throw new IllegalArgumentException("Задача не может быть пустой");
        }
        boolean exists = tasks.stream()
                .anyMatch(t -> Objects.equals(t.getID(), task.getID()));

        if(exists){
            throw new IllegalArgumentException("Задача с таким ID уже существует");
        }
        tasks.add(task);
    }

    public synchronized boolean removeTask(T id){
        if(id == null){
            throw new IllegalArgumentException("ID не может быть пустой");
        }
        Iterator<Task<T>> iterator = tasks.iterator();
        while (iterator.hasNext()){
            Task<T> task = iterator.next();
            if(Objects.equals(task.getID(),id)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Task<T>> filterTaskByStatus(Status status){
        if(status == null){
            throw new IllegalArgumentException("Статус не может быть пустым");
        }
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .toList();
    }

    public List<Task<T>> filterTAskByPriority(Priority priority){
        if(priority == null){
            throw new IllegalArgumentException("Приоритет не может быть пустым");
        }
        return tasks.stream()
                .filter(t -> t.getPriority() == priority)
                .toList();
    }

    public List<Task<T>> sortTaskByDate(){
        return tasks.stream()
                .sorted(Comparator.comparing(Task<T>::getDate).reversed())
                .toList();
    }

}

package practice_12.Task6;

import java.util.Date;
import java.util.Objects;

public class Task<T> {


    private T ID;
    private  Status status;
    private  Priority priority;
    private Date date;

    public Task(T ID, Status status, Priority priority, Date date) {
        this.ID = ID;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public T getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return Objects.equals(ID, task.ID) && status == task.status && priority == task.priority && Objects.equals(date, task.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, status, priority, date);
    }
}

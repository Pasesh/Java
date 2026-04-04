package practice_12.Task1;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

//<T> == <Student>

public class EntityManager<T extends Entity> { //"класс, который хранит объекты и умеет с ними работать"
    private final CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();//при изменении создаёт копию

    public void addEntity(T entity) {
        entities.add(entity);
    }

    public boolean removeEntity(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll() {//вернуть копию списка всех объектов
        return List.copyOf(entities);// делается что бы через этот методы нельзя было изменить entities
    }

    public List<T> filterByAge(int min, int max) {
        //entity.age >= min && entity.age <= max ->t rue
        return entities.stream().filter(entity -> entity.getAge() >= min && entity.getAge() <= max)
                .toList();
    }

    public List<T> filterByName(String name) {
        return entities.stream().filter(entity -> Objects.equals(entity.getName(), name))
                .toList();
    }

    public List<T> filterByActive(boolean isActive) {
        return entities.stream().filter(entity -> entity.isActive() == isActive)
                .toList();
    }

}

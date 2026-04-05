package practice_12_hw.Task1;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class EntityManager<T extends Entity> {
    private final CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void addEntity(T entity){
        entities.add(entity);
    }

    public boolean removeEntity(T entity){
        return entities.remove(entity);
    }

    public List<T> getAll(){
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int min, int max){

       return entities.stream()
               .filter(e ->e.getAge() >= min && e.getAge() <= max)
               .toList();
    }

    public List<T> filterByName(String name){
        return entities.stream()
                .filter(e -> Objects.equals(e.getName(), name))
                .toList();
    }

    public List<T> filterByActive(boolean isActive){
        return entities.stream()
                .filter(e -> e.isActive() == isActive)
                .toList();
    }

}

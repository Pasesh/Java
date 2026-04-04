package practice_12.Task1;

import java.util.Objects;

public abstract class Entity { //базовый класс "шаблон сущности"
    private String name;
    private int age;
    private boolean isActive;

    public Entity(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return age == entity.age && isActive == entity.isActive && Objects.equals(name, entity.name);
        //в классе Objects вызови метод equals и передай 2 аргумента"
        //name → поле текущего объекта
        //entity.name → поле другого объекта
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isActive);
    }
}

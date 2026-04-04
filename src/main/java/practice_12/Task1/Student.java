package practice_12.Task1;

public class Student extends Entity{ //конкретная реализация
    public Student(String name, int age, boolean isActive) {
        super(name, age, isActive);// вызов конструктора родителя Entity
    }


}

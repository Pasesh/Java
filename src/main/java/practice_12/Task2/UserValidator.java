package practice_12.Task2;

public class UserValidator {

    private final boolean validationEnabled;

    public UserValidator(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    public void validate(User user) {
        if (!validationEnabled) {
            return;
        }
        if (user == null){
            throw new InvalidUserException("Пользователь отсутствует");
        }
        validateName(user);
        validateAge(user);
        validateEmail(user);

    }

    private  void validateName(User user) {
        String name = user.getName();
        {
            if (name == null || name.isBlank()) {//строка пустая или состоит только из пробелов
                throw new InvalidUserException("Имя пользователя не должно быть пустым");
            }
            if (!Character.isUpperCase(name.charAt(0))) {
                throw new InvalidUserException("Имя пользователя должно начинаться с заглавной буквы");
            }
        }
    }

    private  void validateAge(User user) {
        int age = user.getAge();
            if (age < 18 || age > 100) {
                throw new InvalidUserException("Возраст пользователя должен быть в диапазоне от 18 до 100");
        }

    }

    private  void validateEmail(User user) {
        String email = user.getEmail();
        if (email == null || email.isBlank()) {
            throw new InvalidUserException("Email пользователя не должен быть пустым");
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new InvalidUserException("Некорректный формат email");
        }
    }
}

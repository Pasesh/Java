package practice_12.Task6;

public enum Status {
    TODO,          // задача создана, но ещё не начата
    IN_PROGRESS,   // в работе
    IN_REVIEW,     // на проверке (например, код-ревью)
    BLOCKED,       // есть препятствие
    DONE
}

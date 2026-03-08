package practice_7_hw.ExceptionTasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void readFile(){
        try {
            FileReader reader = new FileReader("data.txt");
            System.out.println("Файл успешно открыт");
        }catch (FileNotFoundException e){
            System.err.println("Файл не найден");
        }catch (IOException e) {
            System.err.println("Ошибка при закрытии файла");
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}

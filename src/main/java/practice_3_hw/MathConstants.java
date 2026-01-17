package practice_3_hw;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double calculateCircleArea(double r){
        return PI * r * r;
    }

    static double calculateCircumference(double r){
        return 2 * PI * r;
    }

    static void printInfo(double r){
        System.out.println("Площадь круга: " + calculateCircleArea(r) + ", длина окружности: " + calculateCircumference(r));
    }
}

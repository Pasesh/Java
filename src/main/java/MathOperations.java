public class MathOperations {

    public static int add (int x, int y){
        return x + y;
    }

    public static int subtract (int x, int y) {
        return x - y;
    }

    public static int multiply (int x, int y){
        return  x * y;
    }

    public static double divide (int x, int y){
        return (double) x / y;
    }

    public static int findMax (int a, int b){
        int maxMum = Math.max(a, b);
        return maxMum;
    }

    public static int difference (int x, int y){
        return Math.abs(x - y);
    }
    public static int squareArea (int side){
        int area = side * side;
        return area;
    }

    public static int squarePerimeter(int side){
        int perimeter = 4 * side;
        return perimeter;
    }

    public static double convertSecondsToMinutes (int seconds){
        return (double) seconds / 60;
    }

    public static double averageSpeed (double distance, double time){
        double avgSpeed = distance / time;
        return avgSpeed;
    }

    public static double findHypotenuse(double a, double b){
        double hypotenuse = Math.sqrt(a * a + b * b);
        return hypotenuse;
    }

    public static double circleCircumference (double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage (double total, double part){
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit (double c){
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius (double f){
        return (f - 32) * 5 / 9;
    }


    public static void main (String [] args){

        int resulAdd = add(5, 6);
        System.out.println("Результат задача 1a: "+ resulAdd);

        int resultSubtract = subtract(10,7);
        System.out.println("Результат задача 1b: " + resultSubtract);

        int resultMultiply = multiply(5,6);
        System.out.println("Результат задача 1c: " + resultMultiply);

        double resultDived = divide(18,5);
        System.out.println("Результат задача 1d: " + resultDived);

        int resultFindMax = findMax(15,25);
        System.out.println("Результат задача 2: " + resultFindMax);

        int resultDifference = difference (5, 17);
        System.out.println("Результат задача 3: " + resultDifference);

        int resultArea = squareArea(8);
        System.out.println("Результат задача 4a: " + resultArea);

        int resultPerimeter = squarePerimeter (6);
        System.out.println("Результат задача 4b: " + resultPerimeter);

        double resultConvert = convertSecondsToMinutes (181);
        System.out.println("Результат задача 5: " + resultConvert);

        double resultAvgSpeed = averageSpeed(25.6, 3);
        System.out.println("Результат задача 6: " + resultAvgSpeed);

        double resultHypotenuse = findHypotenuse(10, 2);
        System.out.println("Результат задача 7: " + resultHypotenuse);

        double resultCircumference = circleCircumference(2);
        System.out.println("Результат задача 8: " + resultCircumference);

        double resultCalcPercentage = calculatePercentage( 100, 7);
        System.out.println("Результат задача 9: " + resultCalcPercentage);

        double resultFahrenheit = celsiusToFahrenheit(15);
        System.out.println("Результат задача 10a: " + resultFahrenheit);

        double resultCelsius = fahrenheitToCelsius(60);
        System.out.println("Результат задача 10b: " + resultCelsius);

    }

}

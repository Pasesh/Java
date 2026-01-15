package practice_2_hw;

public class Circle {

    double radius;

    Circle(double someRadius){
        this.radius = someRadius;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    double calculateArea(){
        return Math.PI * this.radius * this.radius;
    }

    double calculateCircumference(){
        return 2 * Math.PI * this.radius;
    }

    void print(){
        System.out.println("Площадь окружности: " + calculateArea() + ", длина окружности: " + calculateCircumference());
    }
}

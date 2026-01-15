package practice_2_hw;

public class Rectangle {

    int width;
    int height;

    Rectangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height =someHeight;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width = newWidth;
    }

    int calculateArea(){
        return this.width * this.height;
    }

    void print(){
        System.out.println("Площадь прямоугольника: " + calculateArea());
    }
}

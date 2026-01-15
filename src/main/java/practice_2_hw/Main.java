package practice_2_hw;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Kia", 2010);

        car.setYear(2015);
        car.print();

        Rectangle rectangle = new Rectangle(4, 5);

        rectangle.setWidth(6);
        rectangle.print();

        Book book = new Book("Муму", "Пушкин А.С.");

        book.setAuthor("Тургенев И.С.");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Скрудж", 1000000);

        bankAccount.deposit(250.25);
        bankAccount.withdraw(150.20);
        bankAccount.printBalance();

        Point point = new Point(3, 8);

        point.setX(6);
        point.print();

        StudentGroup studentGroup = new StudentGroup("81-a", 15);

        studentGroup.setStudentCount(12);
        studentGroup.printInfo();

        Circle circle = new Circle(5);

        circle.setRadius(1);
        circle.print();

        Teacher teacher = new Teacher("Иванова И.И.", "Химия");

        teacher.setSubject("Физика");
        teacher.printInfo();

        Product product = new Product("Сыр", 240);

        product.setPrice(300);
        product.applyDiscount(15);
        product.printInfo();

        Laptop laptop = new Laptop("Lenovo", 69999.99);

        laptop.setPrice(100000.01);
        laptop.printInfo();

    }
}

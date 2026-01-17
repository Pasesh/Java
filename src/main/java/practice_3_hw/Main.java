package practice_3_hw;



public class Main {
    public static void main(String[] args) {

        Company emp1 = new Company(1, "Роман");
        Company emp2 = new Company(2, "Александр");

        Company.companyName = "Google";
        Company.printCompanyName();

        //emp1.employeeID = 5;

        MathConstants.printInfo(5);

        University student1 = new University(1, "Григорий");
        University student2 = new University(2, "Кизьмин");
        University student3= new University(3, "Татьяна");

        University.changeUniversityName("МГУ");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings game1 = new GameSettings("Покер", 4);
        GameSettings game2 = new GameSettings("Дурак", 2);

        GameSettings.setMaxPlayers(4);

        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();

        Person person1 = new Person("Алексей", "Иванченко", "555-45-6555");
        Person person2 = new Person("Дмитрий", "Горный", "321-99-6577");

        person1.setFirstName("Алекс");

        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}

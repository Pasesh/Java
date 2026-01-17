package practice_3_hw;

public class Person {

    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }

    String getSsn(){
        return ssn;
    }

    void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    void  setLastName(String newLastName){
        lastName = newLastName;
    }

    void printPersonInfo(){
        System.out.println("Имя: " + firstName + " , Фамилия: " + lastName + ", SSN: " + ssn);
    }
}

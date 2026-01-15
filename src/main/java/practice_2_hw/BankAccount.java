package practice_2_hw;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String someOwner, double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner(){
        return this.owner;
    }

    double getBalance(){
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    void deposit(double amount){
        this.balance = this.balance  + amount;
    }

    void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    void printBalance(){
        System.out.println("Баланс: " + this.balance);
    }
}

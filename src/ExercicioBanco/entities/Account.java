package ExercicioBanco.entities;

public class Account {
    private String holder;
    private int number;
    private double balance;

    public Account() {

    }

    public Account(String holder, int number, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount - 5;
    }

    public String toString() {
        return "Account data: \n" + "Account " + getNumber() + " Holder: " + getHolder() + ", Balance: $ " + getBalance();

    }
}

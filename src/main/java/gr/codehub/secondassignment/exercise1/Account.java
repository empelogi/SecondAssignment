package gr.codehub.secondassignment.exercise1;

public class Account {

    private String owner;
    private double balance;
    private int numberOfTransactions;

    //this is the constructor with all arguments
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = 0;
    }

    //this is the default constructor
    public Account() {
    }

    //getter and setter methods for all fields

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    //to string method

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }

    //deposit method
    public void deposit(double amount) {
        balance = balance + amount;
        numberOfTransactions++;
    }

    //withdraw method
    public void withdraw(double withdraw) {
        balance = balance - withdraw;
        numberOfTransactions++;
    }


}

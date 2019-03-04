package week3.inclass;

public class BankAccount{

    private int id;
    private String owner;
    protected int balance;

    public BankAccount(int id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public int withdraw(int amount) {

        int returnAmount = 0;
        if(this.balance >= amount) {
            this.balance -= amount;

            returnAmount = amount;
        } else {
            System.out.println("You don't have enough balance.");
        }
        System.out.println("Your current balance: " + this.balance);

        return returnAmount;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("You've successfully deposit " + amount);
        } else {
            System.out.println("Invalid amount entered.");
        }
    }

    public int getId() {
        return this.id;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getBalance() {
        return this.balance;
    }

    public void serOwner(String owner) {
        this.owner = owner;
    }
}
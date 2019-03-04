package week3.inclass;

public class SavingAccount extends BankAccount {

    public static final double INTEREST = 0.05;
    public static final int DURATION = 1;

    private int id;
    private String owner;
    private int balance;
    private int contractYear;
    private int since;


    public SavingAccount(int id, String owner, int balance, int contractYear, int since) {
        super(id, owner, balance);
        this.contractYear = contractYear;
        this.since = since;
    }

    @Override
    public int withdraw(int amount) {

        int returnAmount = 0;

        if(amount > 0
            && this.balance >= amount
            && this.contractYear <= (this.since + DURATION)
        ) {
            this.balance -= amount;
            System.out.println("You've successfully withdrawn " + amount);

            returnAmount = amount;
        } else {
            System.out.println("You don't have enough money.");

            returnAmount = 0;
        }
        System.out.println("You're current balance is " + amount);

        return returnAmount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

}
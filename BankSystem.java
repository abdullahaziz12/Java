abstract class Account {
    private String accountNumber;
    private double balance;
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    abstract void withdraw(double amount);
    public void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    private final double BALANCE = 500;
    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= BALANCE) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Minimum balance must be maintained!");
        }
    }
}
class CurrentAccount extends Account {
    private final double OVERDRAFTLIMIT = -1000;
    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= OVERDRAFTLIMIT) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn from Current: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("SA123", 2000);
        Account acc2 = new CurrentAccount("CA456", 1000);
        acc1.withdraw(1700);  
        acc2.withdraw(1800); 
        acc1.display();
        acc2.display();
    } 
}
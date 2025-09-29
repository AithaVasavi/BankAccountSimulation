package BankSystem;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Account {
    private String accountNumber;
    private String ownerName;
    protected double balance;            
    private List<Transaction> transactions;

    public Account(String accountNumber, String ownerName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = Math.max(0.0, initialDeposit);
        this.transactions = new ArrayList<>();
        if (initialDeposit > 0) {
            transactions.add(new Transaction("DEPOSIT", initialDeposit, balance, "Initial deposit"));
        }
    }

    
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public double getBalance() { return balance; }

    
    public List<Transaction> getTransactions() { return Collections.unmodifiableList(transactions); }

    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount, balance, ""));
        System.out.printf("₹ %.2f deposited to %s. New balance: ₹ %.2f%n", amount, accountNumber, balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount, balance, ""));
        System.out.printf("₹ %.2f withdrawn from %s. New balance: ₹ %.2f%n", amount, accountNumber, balance);
        return true;
    }

    
    protected void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void printStatement() {
        System.out.println("---------------------------------------------------------------");
        System.out.printf("Account: %s | Owner: %s | Balance: ₹ %.2f%n", accountNumber, ownerName, balance);
        System.out.println("Date/time           | Type         |     Amount | Balance     | Description");
        System.out.println("--------------------------------------------------------------------------");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return String.format("%s - %s | Balance: ₹ %.2f", accountNumber, ownerName, balance);
    }
}


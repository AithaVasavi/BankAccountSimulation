package BankSystem;


import java.util.ArrayList;
import java.util.List;


public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public Account createAccount(String accNo, String owner, double initialDeposit) {
        if (findAccount(accNo) != null) {
            System.out.println("Account with this number already exists.");
            return null;
        }
        Account a = new Account(accNo, owner, initialDeposit);
        accounts.add(a);
        System.out.println("Created: " + a);
        return a;
    }

    public Account findAccount(String accNo) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accNo)) return a;
        }
        return null;
    }

    public boolean transfer(String fromAcc, String toAcc, double amount) {
        Account from = findAccount(fromAcc);
        Account to = findAccount(toAcc);

        if (from == null) {
            System.out.println("Sender account not found: " + fromAcc);
            return false;
        }
        if (to == null) {
            System.out.println("Receiver account not found: " + toAcc);
            return false;
        }
        if (amount <= 0) {
            System.out.println("Transfer amount must be positive.");
            return false;
        }
        if (from.getBalance() < amount) {
            System.out.println("Insufficient funds in sender account.");
            return false;
        }

        
        from.balance -= amount;
        from.addTransaction(new Transaction("TRANSFER_OUT", amount, from.getBalance(), "To " + toAcc));

        to.balance += amount;
        to.addTransaction(new Transaction("TRANSFER_IN", amount, to.getBalance(), "From " + fromAcc));

        System.out.printf("Transferred ₹ %.2f from %s to %s%n", amount, fromAcc, toAcc);
        return true;
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts registered yet.");
            return;
        }
        System.out.println("--- Accounts ---");
        for (Account a : accounts) {
            System.out.println(a);
        }
    }
}


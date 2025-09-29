package BankSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1": 
                    System.out.print("Account number: ");
                    String accNo = sc.nextLine().trim();
                    System.out.print("Owner name: ");
                    String owner = sc.nextLine().trim();
                    System.out.print("Initial deposit: ");
                    double init = readDouble(sc);
                    bank.createAccount(accNo, owner, init);
                    break;
                case "2": 
                    System.out.print("Account number: ");
                    accNo = sc.nextLine().trim();
                    Account a = bank.findAccount(accNo);
                    if (a == null) { System.out.println("Account not found."); break; }
                    System.out.print("Deposit amount: ");
                    double dAmt = readDouble(sc);
                    a.deposit(dAmt);
                    break;
                case "3": 
                    System.out.print("Account number: ");
                    accNo = sc.nextLine().trim();
                    a = bank.findAccount(accNo);
                    if (a == null) { System.out.println("Account not found."); break; }
                    System.out.print("Withdraw amount: ");
                    double wAmt = readDouble(sc);
                    a.withdraw(wAmt);
                    break;
                case "4": 
                    System.out.print("From account: ");
                    String from = sc.nextLine().trim();
                    System.out.print("To account: ");
                    String to = sc.nextLine().trim();
                    System.out.print("Amount: ");
                    double tAmt = readDouble(sc);
                    bank.transfer(from, to, tAmt);
                    break;
                case "5": 
                    System.out.print("Account number: ");
                    accNo = sc.nextLine().trim();
                    a = bank.findAccount(accNo);
                    if (a == null) { System.out.println("Account not found."); break; }
                    a.printStatement();
                    break;
                case "6":
                    bank.listAccounts();
                    break;
                case "7":
                    running = false;
                    System.out.println("Exiting. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1-7.");
            }
        }

        sc.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Bank Menu ---");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Print Statement");
        System.out.println("6. List Accounts");
        System.out.println("7. Exit");
        System.out.print("Choose (1-7): ");
    }

    
    private static double readDouble(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Enter again: ");
            }
        }
    }
}


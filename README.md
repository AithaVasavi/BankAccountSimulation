# BankAccountSimulation  

🏦 **Bank Account Simulation (Java, Console-based)**  
📌 **Objective**  

A simple Bank Account Simulation built in Java (Eclipse IDE) that demonstrates core OOP principles and console-based interaction.  
The project simulates accounts, deposits, withdrawals, transfers, and transaction history.  

---

🚀 **Features**  

1.➕ Create Account (with account number, owner name, initial deposit)  

2.💰 Deposit Money (updates balance & adds transaction)  

3.💸 Withdraw Money (with validation for insufficient funds)  

4.🔄 Transfer Funds (between accounts with double-entry transaction records)  

5.📑 Print Statement (transaction history with timestamp, type, amount, balance, description)  

6.📋 List Accounts (overview of all registered accounts)  

7.✅ Demonstrates:  

                7a.Classes & Objects  

                7b.Inheritance-ready design (Account can be extended for SavingsAccount / CurrentAccount)  

                7c.Encapsulation (private fields + public methods)  

                7d.Transaction history management with ArrayList  

                7e.Exception handling & input validation  

---

🛠️ **Tech Stack**  

Language: Java (JDK 17+)  

IDE: Eclipse (or IntelliJ / VS Code)  

Execution: Console  

---

📂 **Project Structure (Eclipse)**  
BankSimulation/  
 ├── .classpath  
 ├── .project  
 ├── src/  
 │    └── banksystem/  
 │          ├── Transaction.java  
 │          ├── Account.java  
 │          ├── Bank.java  
 │          └── Main.java  
 └── README.md  

 ---

▶️ **How to Run**  

**Run in Eclipse**  

1.Create a new Java Project BankSimulation.  

2.Create a package banksystem.  

3.Add the 4 Java files: Transaction.java, Account.java, Bank.java, Main.java.  

4.Right-click Main.java → Run As → Java Application.  

---

📝 **Sample Output**  
--- Bank Menu ---
1. Create Account
2. Deposit
3. Withdraw
4. Transfer
5. Print Statement
6. List Accounts
7. Exit
Choose (1-7): 1  
Account number: A001  
Owner name: Vasuki  
Initial deposit: 10000  
Created: A001 - Vasuki | Balance: ₹ 10000.00  

Choose (1-7): 1  
Account number: A002  
Owner name: Yash  
Initial deposit: 8000  
Created: A002 - Yash | Balance: ₹ 8000.00  

Choose (1-7): 4  
From account: A001  
To account: A002  
Amount: 300  
Transferred ₹ 300.00 from A001 to A002  

Choose (1-7): 5  
Account number: A001  
---------------------------------------------------------------  
Account: A001 | Owner: Vasuki | Balance: ₹ 9700.00  
Date/time           | Type         |     Amount | Balance     | Description  
--------------------------------------------------------------------------  
2025-09-29 15:45:12 | DEPOSIT      |    10000.00 | Balance: 10000.00 | Initial deposit  
2025-09-29 15:47:08 | TRANSFER_OUT |     300.00 | Balance:  9700.00 | To A002  
--------------------------------------------------------------------------  

---

🎯 **Learning Outcomes**   

1.Apply Object-Oriented Programming (OOP) concepts in Java  

2.Understand account operations & transaction history  

3.Work with ArrayList, loops, conditionals, and encapsulation  

4.Handle user input and basic validations  

5.Build a console-based mini-project ready for portfolio/resume  

---

🔮 **Future Improvements**  

1.Add SavingsAccount / CurrentAccount subclasses with overridden rules (interest, limits, fees)  

2.Implement file persistence (save/load accounts & transactions to file)  

3.Add GUI interface using Swing/JavaFX  

4.Integrate with database (MySQL/SQLite) for real-world simulation  

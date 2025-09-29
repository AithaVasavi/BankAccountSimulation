package BankSystem;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Transaction {
    private LocalDateTime timestamp;
    private String type;         
    private double amount;
    private double balanceAfter;
    private String description;

    private static final DateTimeFormatter FMT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Transaction(String type, double amount, double balanceAfter, String description) {
        this.timestamp = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.description = description == null ? "" : description;
    }

    @Override
    public String toString() {
        return String.format("%s | %-12s | %10.2f | Balance: %10.2f | %s",
                timestamp.format(FMT), type, amount, balanceAfter, description);
    }
}


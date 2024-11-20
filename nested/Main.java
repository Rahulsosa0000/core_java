package com.nested;

class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Nested class to represent a transaction
    class Transaction {
        private String type;  // e.g., "Deposit" or "Withdrawal"
        private double amount;

        // Constructor
        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
            processTransaction();
        }

        // Process the transaction
        private void processTransaction() {
            if (type.equals("Deposit")) {
                balance = balance+ amount;
            } else if (type.equals("Withdrawal") && amount <= balance) {
                balance = balance- amount;
            } else {
                System.out.println("Invalid transaction or insufficient balance.");
            }
        }
        
        // Display transaction details
        public void showTransactionDetails() {
            System.out.println(type + " of amount: " + amount + ". New balance: " + balance);
        }
    }

    // Method to make a transaction
    public void makeTransaction(String type, double amount) {
        Transaction transaction = new Transaction(type, amount);  // Create a transaction
        transaction.showTransactionDetails();  // Display transaction details
    }

    // Display the current balance
    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345");
        
        account.makeTransaction("Deposit", 1000.0);  // Deposit 1000
        account.makeTransaction("Withdrawal", 200.0);  // Withdraw 200
        
        account.showBalance();  // Show final balance
    }
}

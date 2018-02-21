package com.junkamimura;

// Challenge
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class Bank_Account {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
//A quick way to create getters and setters is >>> Code >>> Generate >>>...
//A handy way to initialize parameters are using Constructor

    public Bank_Account() {
        this(0000, 0, "Default Name", "Default Email", "Default Phone Number");
        System.out.println("Empty constructor is called");
    }

    public Bank_Account(int number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters is called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        this.balance = (this.balance + depositAmount);
        System.out.println("You made $" + depositAmount + " deposit. " + "You have $" + this.balance + " in your bank account.");
    }

    public void withdraw(double withdrawAmount) {
        if (balance >= withdrawAmount) {
            this.balance = this.balance - withdrawAmount;
            System.out.println("Your remaining balance is $" + this.balance + " in your bank account.");
        }
        else {
            System.out.println("The withdrawal amount exceeds the balance! Currently you have $" + this.balance + " in your bank account.");
        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

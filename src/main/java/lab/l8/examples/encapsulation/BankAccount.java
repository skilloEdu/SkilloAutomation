package main.java.lab.l8.examples.encapsulation;

import java.util.Date;
import java.util.Random;

public class BankAccount {
    private String ownerName;
    private double accountBalance = 0;
    private String accountNumber;

    BankAccount(String name){
        this.ownerName = name;
        setAccountNumber(name);
    }

    public String getOwnerName() {
        return this.ownerName;
    }
    public void setOwnerName(String ownerName) {
        if(this.ownerName == null)
            this.ownerName = ownerName;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    private void setAccountNumber(String name) {
        name = name.replace(" ", "");
        Date d = new Date();
        Random r = new Random();
        this.accountNumber = name + d.getTime() + r.nextInt();
    }

    public void makeTransaction(double transaction) {
        if(accountBalance + transaction >= 0) {
            this.accountBalance = this.accountBalance + transaction;
        } else {
            throw new RuntimeException("Insufficient balance!");
        }
    }
}

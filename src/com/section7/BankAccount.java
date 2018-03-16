package com.section7;

public class BankAccount {

    private int accountNumber;
    private int accountBalance;
    private String accountHolderName;
    private String accountHolderEmail;
    private String accountHolderNumber;

    public long getAacountNumber() {
        return accountNumber;
    }

    public void setAacountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    public void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }

    public String getAccountHolderNumber() {
        return accountHolderNumber;
    }

    public void setAccountHolderNumber(String accountHolderNumber) {
        this.accountHolderNumber = accountHolderNumber;
    }

    public int depositFunds (int amount) {


        return this.accountBalance+=amount;

    }

    public int withdrawFunds (int amount) {

        if(this.accountBalance>=amount && amount>0 ) {

            this.accountBalance-=amount;

            return amount;
        }
        else {

            System.out.println("Please review the amount entered");
        }

        return -1;
    }
}

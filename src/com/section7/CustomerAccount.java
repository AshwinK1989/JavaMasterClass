package com.section7;

public class CustomerAccount {


    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.setAacountNumber(123);
        ba.setAccountHolderName("Ashwin");
        ba.setAccountHolderEmail("test@gmail.com");
        ba.setAccountHolderNumber("982098563");
        ba.depositFunds(5000);
        System.out.println("The account balance is "+ba.getAccountBalance());
        ba.withdrawFunds(-1000);

        System.out.println("The account balance is "+ba.getAccountBalance());


    }
}

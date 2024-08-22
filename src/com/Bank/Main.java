package com.Bank;

public class Main {
    public static void main(String[] args) {
        Account gagana = new Account("1", 0.0, "Gagana", "gagana@gmail.com", "0773113931");

        gagana.Deposit(1000);
        gagana.Withdraw(1001);
        gagana.Balance();
    }
    //Customer name. Customer Account number
    //customer E-mail, Balance, Phone number
    //Deposit Money Withdraw
}
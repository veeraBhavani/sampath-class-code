package com.wbl.basic;

/**
 * Created by Sampath on 8/19/2015.
 * @see This is my first business class
 * @version 1.0
 * @author Sampath
 */
public class Account {

    public int accountNumber;
    public AccountType accountType;
    private double accountBalance;
    private String accountPrimaryAddress;

    //single line comment
    /*
    *multi
    * line
    * comment
     */

    public Account() {
        //db
        //conn
        //stnt//
        //25
        this.accountBalance = 25;
    }

    public String getAccountPrimaryAddress() {
        if (accountPrimaryAddress == null) {
            return "No Address";
        }
        return accountPrimaryAddress;
    }

    public void setAccountPrimaryAddress(String accountPrimaryAddress) {
        this.accountPrimaryAddress = accountPrimaryAddress;
    }

    public double getAccountBalance() {
        double balance = 0;

        switch (accountType) {
            case SAVING:
                balance = accountBalance + accountBalance * 0.00001;
                break;
            case CHECKING:
                balance = accountBalance;
                break;
            default:
                balance = accountBalance;
                break;
        }

        return balance;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }


}

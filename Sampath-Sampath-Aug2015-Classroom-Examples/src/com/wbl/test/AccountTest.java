package com.wbl.test;

import com.wbl.basic.Account;

/**
 * Created by Sampath on 8/19/2015.
 */
public class AccountTest {

    public static void main(String[] args)
    {

        int i = 10;

        Account a1 = new Account(); //create an object

        a1.deposit(100);
        a1.withdraw(25);
        a1.deposit(.50);
        a1.withdraw(.75);
        a1.setAccountPrimaryAddress("6500 Dublin Blvd Dublin CA");
        System.out.println(a1.getAccountBalance());
        System.out.println(a1.getAccountPrimaryAddress());
    }


}

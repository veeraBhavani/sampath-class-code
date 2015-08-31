package com.wbl.test;

import com.wbl.basic.Account;

/**
 * Created by Sampath on 8/24/2015.
 */
public class DataTypes {


    public static void main(String[] args) {

        Account a1 = null;
        a1 = new Account();
        a1.accountNumber = 101;
        a1.deposit(100);

        System.out.println(a1.getAccountBalance());

        Account a2 = new Account();
        a2.accountNumber = 102;
        a2.deposit(5000);
        a2.withdraw(4950);
        System.out.println(a2.getAccountBalance());

        a2 = a1;
        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());
        a1.deposit(100);
        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());
     /*   int i = 10;
        int j = 20;

        i = 30;
        j = i;

        i = 100;

        System.out.println(i);
        System.out.println(j);*/
    }


}

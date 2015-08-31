package com.wbl.test;

import com.wbl.basic.Account;

/**
 * Created by Sampath on 8/26/2015.
 */
public class DataTypes2 {


    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        i = j;

        i = 30;


        Account a1 = new Account();
        System.out.println(a1.accountNumber);
        System.out.println(a1.getAccountBalance());

        Account a2 = null;
        a2 = a1;
        System.out.println(a2.accountNumber);
        System.out.println(a2.getAccountBalance());

        a1.withdraw(10);
        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());

    }


}

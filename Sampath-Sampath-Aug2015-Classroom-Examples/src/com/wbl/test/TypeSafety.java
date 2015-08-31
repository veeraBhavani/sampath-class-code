package com.wbl.test;

import com.wbl.basic.Account;
import com.wbl.basic.AccountType;

/**
 * Created by Sampath on 8/26/2015.
 */
public class TypeSafety {

    public static void main(String[] args) {

        Account a = new Account();
        a.accountType = AccountType.SAVING;
        System.out.println(a.getAccountBalance());


    }

}

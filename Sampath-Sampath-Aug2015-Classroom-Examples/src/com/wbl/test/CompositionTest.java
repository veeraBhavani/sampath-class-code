package com.wbl.test;

import com.wbl.basic.Account;
import com.wbl.basic.Address;
import com.wbl.basic.Customer;

/**
 * Created by Sampath on 8/26/2015.
 */
public class CompositionTest {

    public static void main(String[] args) {

        Address a1 = new Address("6501 Dublin Blvd", "Ste 214", 94568);

        Customer c = new Customer();
        c.workAddress = new Address("6500 Dublin Blvd", "Ste 3200", 94568);
        c.homeAddress = a1;
        c.accounts = new Account[2];
        c.accounts[0] = new Account();
        c.accounts[0].deposit(5000);

        c.accounts[1] = new Account();
        c.accounts[1].deposit(500);


        System.out.println(c.workAddress.getAddres());
        System.out.println(c.homeAddress.getAddres());

        //primitive types, value types, system
        //reference types, String, Account - user defined, System

    }

}

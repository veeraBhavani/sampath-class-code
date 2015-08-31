package com.wbl.test;

import com.wbl.basic.Account;

/**
 * Created by Sampath on 8/26/2015.
 */
public class PassByValue {


    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(25);
        System.out.println(a1.getAccountBalance());
        doSomething(a1);
        System.out.println(a1.getAccountBalance());
       /* int a = 0;
        int b = 10;

        doSomething(a);
        System.out.println(a + ":" + b);*/
        // int b = add(a,b);
    }

    public static void doSomething(Account a) {
        a.withdraw(50);
    }

  /*  public static int add(int a, int b)
    {
        return a+b;
    }*/


    public static void doSomething(int a) {
        int b = 15;
        a = 20;
    }

}

//global scope
//class scope
//method scope
//block scope
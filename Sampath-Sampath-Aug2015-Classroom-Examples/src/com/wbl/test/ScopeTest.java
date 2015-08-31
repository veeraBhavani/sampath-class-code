package com.wbl.test;

import com.wbl.basic.Scope1;

/**
 * Created by Sampath on 8/26/2015.
 */
public class ScopeTest {

    public static void main(String[] args) {

        Scope1 s1 = new Scope1();
        s1.doSomething();


        Scope1 s2 = new Scope1();
        s2.i = s2.i + 20;
        System.out.println(s2.i);
    }
}

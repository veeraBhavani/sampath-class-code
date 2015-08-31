package com.wbl.basic;

/**
 * Created by Sampath on 8/26/2015.
 */
public class Scope1 {

    public int i = 10;

    public void doSomething() {
        int i = 11;
        this.i = i;
    }


}

package com.wbl.test;

import com.wbl.basic.Employee;

/**
 * Created by Sampath on 8/24/2015.
 */
public class EmployeeTest {

    public static void main(String[] args) {

        int[] arr = new int[5];

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        Employee e3 = null; //null pointer exception
        e3 = e2;
        e1.salary = 100;

        e2 = null;

        e2 = new Employee();
        e2.salary = 1000;

        e1 = e2;
        e1.salary = 300;


    }


}

package com.wbl.basic;

/**
 * Created by Sampath on 8/24/2015.
 */
public class Employee {

    public int id;
    public String name;
    public double salary = 100;

    public Employee() {
        salary += 100;

    }

    public double getAnnualSalary() {
        return salary * 12;
    }

}

package com.wbl.basic;

/**
 * Created by Sampath on 8/26/2015.
 */
public class Address {

    private String address1;
    private String address2;
    private String city;
    private String state;
    private int zip;

    public Address(String address1, String address2, int zip) {
        this.address1 = address1;
        this.address2 = address2;
        this.zip = zip;
        this.city = "Dublin";
        this.state = "CA";
    }


    public String getAddres() {
        return address1 + "\n" + address2 + "\n" + city + " " + state + " " + zip;
    }


}

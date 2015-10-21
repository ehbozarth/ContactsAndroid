package com.theironyard.contactsandroid;

/**
 * Created by earlbozarth on 10/21/15.
 */
public class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return String.format("%s (%s)", name, phone);
    }

}

package com.example.devendratadiyal.databinding;

/**
 * Created by Devendra Tadiyal on 2/9/2018.
 */

public class User {

    private String firstName;
    private String lastName;

    User(String firstName,String lastName)
    {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }





}

package com.users.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private int id;
    private String userName;
    private String firstName;
    private String lastName;


    public User(){
    }

    public User(int id,String userName,String firstName,String lastName){
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @JsonProperty
    public int getId(){
        return id;
    }

    @JsonProperty
    public String getUserName(){
        return userName;
    }

    @JsonProperty
    public String getFirstName(){
        return firstName;
    }

    @JsonProperty
    public String getLastName(){
        return lastName;
    }

}

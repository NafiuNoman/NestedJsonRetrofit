package com.example.mastercodingnestedjsonretrofit.models;

public class UserDataModel {

    private int id;
    private String name;
    private UserDetailsModel Details;

    public UserDataModel() {
    }

    public UserDataModel(int id, String name, UserDetailsModel details) {
        this.id = id;
        this.name = name;
        Details = details;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDetailsModel getDetails() {
        return Details;
    }

    public void setDetails(UserDetailsModel details) {
        Details = details;
    }
}

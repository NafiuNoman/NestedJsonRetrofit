package com.example.mastercodingnestedjsonretrofit.models;

public class UserDetailsModel {

    private String behaviour;
    private String hairColor;

    public UserDetailsModel() {
    }

    public UserDetailsModel(String behaviour, String hairColor) {
        this.behaviour = behaviour;
        this.hairColor = hairColor;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}

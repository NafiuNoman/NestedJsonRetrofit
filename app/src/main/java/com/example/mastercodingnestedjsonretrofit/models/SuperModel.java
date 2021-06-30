package com.example.mastercodingnestedjsonretrofit.models;

public class SuperModel {

 private UserDataModel[] moviz;

    public SuperModel() {
    }

    public SuperModel(UserDataModel[] moviz) {
        this.moviz = moviz;
    }

    public UserDataModel[] getMoviz() {
        return moviz;
    }

    public void setMoviz(UserDataModel[] moviz) {
        this.moviz = moviz;
    }
}

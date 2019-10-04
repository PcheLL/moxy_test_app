package com.example.testprojectmvp.model;

import com.example.testprojectmvp.in.MainMVP;

public class MainModel implements MainMVP.Model {

    public String loadMessage() {

        return "Android";
    }

}

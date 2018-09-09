package com.udacity.gradle.builditbigger.backend;

import com.example.javajokes.JavaJokesClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    //private String myData;

    public String getData() {
        //return myData;
        return new JavaJokesClass().getJoke();
    }

    /*public void setData(String data) {
        myData = data;
    }*/
}
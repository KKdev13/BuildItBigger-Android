package com.example.javajokes;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class JavaJokesClass {

    List<String> jokes = new ArrayList<String>()
    {{
        add("I don’t expect you to read this since comments are ignored by the compiler.");
        add("There are only 10 kinds of people in this world: those who know binary and those who don’t.");
        add("Programming is 10% science, 20% ingenuity, and 70% getting the ingenuity to work with the science.");
        add("I will leave the relations to the database!");
    }};

    public String getJoke()
    {
        int randomInt = new Random().nextInt(5);
        return jokes.get(randomInt);
    }
}

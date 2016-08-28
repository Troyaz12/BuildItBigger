package com.example;

public class tellJoke {

    public String tellJoke(){

        String[] jokes = new String[]{"What do you call a sad cup of coffee? \n"+
                "Depresso.","What do you call a fake noodle?\n" +
                "An impasta!", "Why is peter pan always flying?\n" +
                "Because he neverlands!","What did the vegetables say at the party?\n" +
                "Lettuce turnip the beet!","Where do animals go when their tails fall off?\n" +
                "The retail store.","Did you hear about the guy whose whole left side was cut off? He's all right now."};

        int index = (int) (Math.random()*6);

        String joke = jokes[index];


        return joke;
    }
}

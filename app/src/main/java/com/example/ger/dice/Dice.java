package com.example.ger.dice;

import java.util.Random;

/**
 * Created by Ger on 3/20/2018.
 */

public class Dice {
    private Integer Sides;

    public Dice() {
        Sides = 0;
    }

    public Dice(Integer sides) {
        Sides = sides;
    }

    public Dice(Dice dice) {
        Sides = dice.getSides();
    }

    public Integer getSides() {
        return Sides;
    }

    public void setSides(Integer sides) {
        Sides = sides;
    }

    public Integer roll() {
        Random r = new Random();
        Integer result = r.nextInt(Sides) + 1;
        return result;
    }
}

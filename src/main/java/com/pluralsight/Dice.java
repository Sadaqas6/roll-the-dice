package com.pluralsight;

// blue print of the dice
public class Dice {
        int roll(){
            // int randomNumber = (int)(Math.random() * maxValue) + minValue;
            int randomNumber = (int)(Math.random() * 6 ) + 1; // gives us a number between 1 and 6
            return randomNumber; // send number back to whoever called roll()
        }



    }


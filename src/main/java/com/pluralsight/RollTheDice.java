package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {


        Dice dice = new Dice();
        //    ^          ^
        //  Our dice   New dice
        //  variable   object


        int roll1;  // collects what dice 1 rolled
        int roll2; // collects what dice 2 rolled

        int count2 = 0; // counting how many times we rolled 2
        int count4 = 0; // rolled 4
        int count6 = 0; // rolled 6
        int count7 = 0; // rolled 7


        // loops 100 times //
        for (int i = 1; i <= 100; i++) {

            // roll the dice twice//
            roll1 = dice.roll();
            roll2 = dice.roll();

            // calculate the total and print
            int sum = roll1 + roll2;

            System.out.println("Roll" + " 1: " + roll1 + " + " + roll2 + " Sum: " + sum);

            if (sum == 2) count2++;
            if (sum == 4) count4++;
            if (sum == 6) count6++;
            if (sum == 6) count7++;

       }

        System.out.printf("2 was rolled %d times%n" , count2);
        System.out.printf("4 was rolled %d times%n" , count4);
        System.out.printf("6 was rolled %d times%n" , count6);
        System.out.printf("7 was rolled %d times%n" , count7);

}
}

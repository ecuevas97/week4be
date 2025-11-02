package week04;

// Week 4 Project - Arrays, Loops, and Methods
// Author: Elena Cuevas
// Notes: This file solves all numbered tasks (1–13) from the assignment.

public class Week04 {

    public static void main(String[] args) {

        // -----------------------------
        // 1) Ages array work
        // -----------------------------
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // 1a) Last minus first (programmatic indexes)
        int diffAges = ages[ages.length - 1] - ages[0];
        System.out.println("1a) Last - First (ages): " + diffAges);

        // 1b) New ages2 (9 elements), then repeat subtraction programmatically
        int[] ages2 = {10, 4, 18, 21, 33, 7, 2, 15, 44};
        int diffAges2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("1b) Last - First (ages2): " + diffAges2 + " (works regardless of length)");

        // 1c) Average age in ages using a loop
        int sumAges = 0;
        for (int a : ages) {
            sumAges += a;
        }
        double avgAges = (double) sumAges / ages.length;
        System.out.println("1c) Average of ages: " + avgAges);

        // -----------------------------
        // 2) Names array work
        // -----------------------------
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // 2a) Average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double avgLetters = (double) totalLetters / names.length;
        System.out.println("2a) Average letters per name: " + avgLetters);

        // 2b) Concatenate all names separated by spaces
        String allNames = "";
        for (int i = 0; i < names.length; i++) {
            allNames += names[i];
            if (i < names.length - 1) {
                allNames += " ";
            }
        }
        System.out.println("2b) All names: " + allNames);
    } // end of main
} // end of class

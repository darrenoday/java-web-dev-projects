package org.launchcode;

import java.util.ArrayList;

public class arrayListPractice {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> integerList = new ArrayList<>();

        // Add 10 integers to the ArrayList
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }

        // Print the ArrayList
        System.out.println("ArrayList with 10 integers:");
        System.out.println(integerList);
        int sumOfEvens = sumEven(integerList);
        System.out.println("Sum of even numbers: " + sumOfEvens);
    }


    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}

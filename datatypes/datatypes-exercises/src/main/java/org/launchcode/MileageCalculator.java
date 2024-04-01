package org.launchcode;
import java.util.Scanner;
public class MileageCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");

        int miles = input.nextInt();

        System.out.println("How many gallons of gas consumed?");

        int gallons = input.nextInt();

        System.out.println("Your mileage per gallon is " + (miles / gallons) + " miles per gallon");



    }
}

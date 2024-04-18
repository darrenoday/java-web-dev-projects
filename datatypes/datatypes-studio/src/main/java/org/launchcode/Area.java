package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle radius ");
        Double radius = input.nextDouble();

        if (radius.isNaN()) {
            System.out.println("please enter only numbers");
        }  if (radius <=0 ){
            System.out.println("please only enter positive number")
        }
        double area = Circle.getArea(radius);
        System.out.println("the circle's area is" + area);






        }

}

package org.launchcode;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here


    MenuItem pizza = new MenuItem("pizza", 25.99, "is a pizza you know what it is","main course", false);
        MenuItem calamari = new MenuItem("calamar", 19.99, "fried tentacles","appetizer", true);
        MenuItem nyCheesecake = new MenuItem("New York Style Cheesecake", 25.99, "the classic","dessert", false);
        MenuItem burger = new MenuItem("burger", 18.99, "meat on a bun","main course", false);

        pizza.printMenuItem();
}

}


package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = -1;

        while (radius < 0) {
            System.out.println("Enter a radius:");
            String userInput = input.nextLine();
            try {
                radius = Double.parseDouble(userInput);
            } catch (NumberFormatException nfe) {
                //nfe.printStackTrace();
                System.out.println("That is not a number.");
            }
        }
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean check = true;
        double height = 0.0, weight = 0.0;


        while(check) {
            System.out.println("Please enter your height in inches: ");
            try {
                height = Double.parseDouble(input.nextLine());
                check = false;
            } catch(Exception ex){
                System.out.println("Please enter a numeric value.");
            }
        }

        check = true;

        while(check) {
            System.out.println("Please enter your weight in pounds: ");
            try {
                weight = Double.parseDouble(input.nextLine());
                check = false;
            }catch(Exception ex) {
                System.out.println("Please enter a numeric value.");
            }
        }

        double BMI = (weight/(height*height)) * 703;

        System.out.format("Your BMI is %.1f.\n", BMI);

        if(BMI > 18.4 && BMI < 25.1){
            System.out.println("You are within the ideal weight range.");
        }else if(BMI < 18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }else {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
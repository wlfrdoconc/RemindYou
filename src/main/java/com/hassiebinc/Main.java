package com.hassiebinc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        // Here is where you write your code
        System.out.println("Welcome to the Remind You app\n");
        // System.out.println();
        System.out.println("Don't forget to track your distance with the fitness app");
        System.out.println("Don't forget to track your calories with the fitness app");

        // Variables CheatSheet

        // String = Datatype
        // appName = VariableName (no spaces, no numbers in the beginning

        // Datatypes
        String appName = "Remind You"; // Text
        int number = 30; // Whole number
        double weight = 80.5; // Decimal number
        boolean happy = true; // true or false
        float salary = 2394.9592f; // Comma number with more decimal (f)
        char firstLetter = 'R';

        // Create your own data types

        // Your name
        String myName = "Will";
        // Your age
        int myAge = 88;
        // Your weight
        double myWeight = 67.67;
        // Dream salary per month
        float mySalary = 10500.5000f;
        // firstLetterOfYourLastname
        char myFirstLetter = 'c';
        // LovesGaming (boolean)
        boolean isGamer = true;

        // Output your results
        System.out.println("=== About Me ===");
        System.out.println("1. My name is: " + myName);
        System.out.println("2. I am: " + myAge + " years old.");
        System.out.println("3. I weigh: " + myWeight + " pounds.");
        System.out.println("4. My dream salary is: $" + mySalary + " per month.");
        System.out.println("5. The first letter of my last name is " + myFirstLetter + ".");
        System.out.println("6. Do I love gaming? " + isGamer);

        // Extra: Create your own data type
        boolean isYearUpStudent = true;
        System.out.println("7. Am I student of Year Up? " + isYearUpStudent);

        // PascalCasing = Classnames (FirstLetter uppercase)
        // camelCase = variables
    }
}
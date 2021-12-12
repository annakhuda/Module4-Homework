package com.annakhuda.automation;

public class Main {
    public static void main(String[] args) {
        // Task 1
        String firstString = "PHP Exercises and";
        String secondString = "Python Exercises ";
        concatenateAndDeleteP(firstString, secondString);

        // Task 2
        Computer computerAsus = new Computer("Asus", 14);
        Computer computerHP = new Computer("HP", 15.6);
        System.out.println("\n" + computerAsus.toString());
        System.out.println(computerHP.toString());

        // Task 4
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.anInt = 45;
        numberHolder.aFloat = 56.45f;
        System.out.println("\nThe anInt number holder = " + numberHolder.anInt +
                " ,the aFloat number holder = " + numberHolder.aFloat);

    }

    public static void concatenateAndDeleteP(String firstString, String secondString) {
        String changedString = (firstString + " " + secondString).replace("P", "")
                .replace("p", "");
        System.out.println(changedString);
        ;
    }

    /*
    Task 5
        * Question
        * 5.The following code creates one array and one string object.
        * How many references to those objects exist after the code executes?
        * Is either object eligible for garbage collection?
            ...
            String[] students = new String[10];
            String studentName = "Peter Parker";
            students[0] = studentName;
            studentName = null;

         * Answer
         * There are 2 references on objects after the code execution: 1st for array "students",
         * 2nd for String "student name". None of these objects are eligible for garbage collection
         * as they are still in use.

       Task 6
         * Question
         * 6.How does a program destroy an object that it creates?

         * Answer
         * When all references on the object are deleted, garbage collector notices this
         * and deletes this object
       */
}

package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {

    public static void main(String[] args) {
        Student std1 = new Student("James", (short) 20); // initializes a student with name "James" and age "20"

        Scanner scnr = new Scanner(System.in); // creates a scanner object
        std1.setGPA(scnr.nextDouble()); // sets the GPA of std1

        System.out.println(std1); // print the toString of std1

        // ToDo 10: submit using a pull request.
    }

}

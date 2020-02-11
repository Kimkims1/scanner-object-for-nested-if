package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char grade = 'F';

        Scanner myObj  = new Scanner(System.in);

        System.out.println("Enter percentage");

        int percentage = myObj .nextInt();

        if (percentage >= 90) {
            grade = 'A';
        }
        else {
            if (percentage >= 80 && percentage <= 89) {
                grade = 'B';
            }
            else {
                if (percentage >= 60 && percentage <= 79) {
                    grade = 'C';
                }
                else {
                    if (percentage >= 33 && percentage <= 59) {
                        grade = 'D';
                    }
                    else {
                        grade = 'F';
                    }
                }
            }
        }

        System.out.println(grade);
    }

}


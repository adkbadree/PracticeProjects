package IfElse;

import java.util.Scanner;

public class IfElseTesting {

    public static void main(String[] args) {

        System.out.println("Enter your marks");

        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("A");
        }
        else if (marks >= 80 && marks < 90) {
             System.out.println("B");
        }
        else if (marks >= 70 && marks < 80) {
            System.out.println("C");
        }

        else if (marks >= 60 && marks <70) {
            System.out.println("D");
        }

        else if (marks >= 0 && marks <60) {
            System.out.println("F");
        }

        else
            System.out.println("Marks not in Range");


    }
}

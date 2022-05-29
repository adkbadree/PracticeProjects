package IfElse;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        System.out.println(" Please enter your marks now !!");

        Scanner scanner = new Scanner(System.in);

       int marks = scanner.nextInt();

        if(marks >= 90 && marks <= 100) {
            System.out.println("Your grade is A");
        } else if (marks >=80 && marks <90) {
            System.out.println( "Your Grade is B");

        } else if (marks >=70 && marks <80) {
            System.out.println(" Your Grade is A");

        } else if (marks <70 && marks >=0) {
            System.out.println("You failed the Exam, you got F");
        }
        else {
            System.out.println("The marks you entered is out of range");
        }

    }
}

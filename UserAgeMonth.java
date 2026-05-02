/*
Write a Java program that:
Prompts the user to:
Enter their name (String)
Enter their age in years (int)
Calculates the user’s age in months (assuming 12 months per year).
Prints a greeting and their age in months using System.out.println().

Sample Output:
What is your name?  
Alice  
How old are you?  
25  
Hello, Alice! You are 300 months old.
*/

import java.util.Scanner;

public class UserAgeMonth{

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name?");
    String name =scanner.next();

    System.out.println("How old are you?");
    int age=scanner.nextInt();
    
    int ageInMonth=age*12;


    System.err.println("Hello, " +name+ "! You are " +ageInMonth+ " months old.");
    }
}
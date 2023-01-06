package org.launchcode.java.demos;
import java.util.Scanner;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        Scanner input;
        input=new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fName=input.next();
        System.out.println("Enter the Last name: ");
        String lName=input.next();
        input.close();
        System.out.println("Hello " + fName +"," + lName);

        System.out.println("Hello, World");
    }
}

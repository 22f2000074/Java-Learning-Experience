package Day1;

import java.util.*;

// Java Day-1
// Developed by James Gosling
// Java was developed in 1991 and was first named OAK
// First edition launched in 1996
// First basic Java program

public class day1 {
    public static void firstprint() {
        System.out.print("Hello World");
        System.out.print("This is the first Java program \n");
        System.out.println("Hello World");
        System.out.print("println prints the next argument in another line");
        // Difference between print and println is that the latter prints the output in different lines, just like \n
    }


// Features of Java
// Java is platform-independent
// Java introduced multi-threading
// Java introduced garbage collection to automatically de-allocate memory
// Java uses both a compiler and an interpreter to run. 
// The Java Development Kit (JDK) has a compiler that converts the .java file into a bytecode file (.class extension).
// The bytecode file is then given to the Java Virtual Machine (JVM), which converts the bytecode to native code (machine-understandable) and then executes it.
// Pattern printing
    public static void pattern() {  // No need for String[] args
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Printing * in the same line
            }
            System.out.println(); // Move to the next line
        }
    }
// Defining Variables
// Java is a statically typed language i.e. the data types of variables is to be declared beforehand.
//int age, string name etc.
    
    public static void conditional_statement(int age){
        if (age>=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }

    }

    public static void main(String[] args) {
        System.out.println("First Print Statements");
        firstprint();
        System.out.println("Calling pattern method:");
        pattern();
        Scanner sc = new Scanner(System.in);//taking input in java
        int age =sc.nextInt();
        System.out.println("Calling if-else loop");
        conditional_statement(age);

    }

    
}
//End of DAY 1
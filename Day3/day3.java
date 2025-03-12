package Day3;

import java.util.*;

public class day3 {
    // Demonstrates the basic syntax of a for loop
    public static void loop_1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is the base statement printed " + (i + 1) + " times");
        }
    }

    // Demonstrates the basic syntax of a while loop
    public static void while_loop() {
        int j = 0;
        while (j < 5) {
            System.out.println("This is the base statement printed " + (j + 1) + " times");
            j += 1;
        }

        // The basic syntax of a do-while loop:
        // do {
        //     // Code to execute at least once
        // } while (condition);
    }

    // Computes the sum of the first n natural numbers
    public static void nsum(int n) {
        int final_sum = 0;
        for (int k = 1; k <= n; k++) {  // Loop iterates from 0 to n 
            final_sum += k;
        }
        System.out.println("The sum of the first " + n + " natural numbers is " + final_sum);
    }

    public static void main(String[] args) { 
        System.out.println("For Loop");
        loop_1();

        System.out.println("\nWhile Loop");
        while_loop();

        System.out.println("\nEnter a number to find the sum of the first n natural numbers:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        nsum(number);

        sc.close();
    }
}

package Day2;

import java.util.Scanner;

public class day2 {
//This is Day 2 of java learning experience
//basic odd even checking using if-else loop
    public static void odd_even (int number){
        if (number%2==0){
            System.out.println("This is an even number");
        }
        else{
            System.out.println("This is an odd number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  number = sc.nextInt();
        System.out.println("Calling odd-even function");
        odd_even(number);

    }
}

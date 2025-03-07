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
    // Using if else-if and else condition
    public static void greater_equal_smaller(int number1,int number2){
        if (number1==number2){
            System.out.println("Equal");
        }
        else if (number1>number2){
            System.out.println(number1 +" is greater than "+ number2);// concatenation of strings using + operator
        }
        else{
            System.out.println(number1 +" is smaller than "+ number2);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter Number to check Odd or Even");
        Scanner sc = new Scanner(System.in);
        int  number = sc.nextInt();
        System.out.println("Calling odd-even function");
        odd_even(number);
        //taking input for second function
        System.out.println("Enter 2 Numbers to compare");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println("Calling greater_equal_smaller function");
        greater_equal_smaller(number1, number2);
        //using switch case statements
        System.out.println("Switch-case");
        int current_bal=1000;
        System.out.println("Welcome to phone banking system");
        System.out.println("Press 1 for withdrawals");
        System.out.println("press 2 for deposit");
        System.out.println("Press 3 for account balance");
        System.out.println("Enter your choice");
        int a=sc.nextInt();
        switch(a){
            case 1: System.out.println("Enter Amount to Withdraw");
            int withdrawalamount=sc.nextInt();
            if (withdrawalamount<=current_bal){    
                current_bal =current_bal-withdrawalamount;
                System.out.println("Amount successfully withdrawn. Final balance is "+current_bal);
            }
            else{
                System.out.println("Low Account Balance");
            }
            break;
            case 2: System.out.println("Enter Amount to Deposit");
            int deposit_amount=sc.nextInt();
            current_bal=current_bal+deposit_amount;
            System.out.println("Amount successfully deposited. Final balance is "+ current_bal);
            break;
            case 3: System.out.println("Your current balance is "+ current_bal);
            break;
            default: System.out.println("Invalid choice");
        


        }
        System.out.println("Thank you for using Phone Banking System");

    }
}

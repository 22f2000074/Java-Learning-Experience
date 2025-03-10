package Day3;

import java.util.*;

public class day3 {
    public static void loop_1(){
        // Basic syntax of a for loop
        for(int i=0;i<5;i++){
            System.out.println("This is the base statement printed "+(i+1)+" times");
        }
    }
    public static void while_loop(){
        // Basic syntax of a while loop
        int j=0;
        while(j<5){
            System.out.println("This is the base statement printed "+(j+1)+" times");
            j+=1;
        }
        // Basic syntax of a do-while loop
        //  do{
        //  }while(condition);
    }
    // Sum of first n natural numbers
    public static void nsum(int n){
        int final_sum=0;
        for (int k=0;k<=n;k++){
            
            final_sum+=k;
        }
        System.out.println("The sum of first "+n+" natural numbers is "+final_sum);
    }

    public static void main(){
        System.out.println("For Loop");
        loop_1();
        System.out.println("\nWhile Loop");
        while_loop();
        System.out.println("\nEnter Number to find sum of first n natural numbers");
        Scanner sc = new Scanner(System.in);
        int  number = sc.nextInt();
        nsum(number);
    }
}

package Day3;

import java.util.Scanner;

public class day3i {

    /*
      Pattern 1: Solid Rectangle
      *****
      *****
      *****
      *****
    */
    public static void pattern1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
      Pattern 2: Hollow Rectangle
      *****
      *   *
      *   *
      *****
    */
    public static void pattern2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {  // Top, Bottom, Left, Right edges
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
      Pattern 3: Half Pyramid
      *
      **
      ***
      ****
    */
    public static void pattern3() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
      Pattern 4: Inverted Half Pyramid
      ****
      ***
      **
      *
    */
    public static void pattern4() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
      Pattern 5: Right-Aligned Half Pyramid
         *
        **
       ***
      ****
    */
    public static void pattern5() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Optimized approach using repeat()
    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(i));
        }
    }

    /*
      Pattern 7: Number Pyramid
      1
      12
      123
      1234
    */
    public static void pattern7() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) { 
        System.out.println("Printing Pattern 1");
        pattern1();

        System.out.println("\nPrinting Pattern 2");
        pattern2();

        System.out.println("\nPrinting Pattern 3");
        pattern3();

        System.out.println("\nPrinting Pattern 4");
        pattern4();

        System.out.println("\nPrinting Pattern 5");
        pattern5();

        System.out.println("\nEnter a number to print Pattern 6:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pattern6(num);

        System.out.println("\nPrinting Pattern 7");
        pattern7();

        sc.close();
    }
}

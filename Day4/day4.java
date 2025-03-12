package Day4;
import java.util.Scanner;
import Day3.day3; // Imported to call the static method nsum

// A simple class with a static method
class Area1 {
    static void area_1() {
        System.out.println("This is area_1 from class Area1");
    }
}

public class day4 {
    // Static methods fun1 and fun2
    static void fun1() {
        System.out.println("A");
    }

    static void fun2() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("C");
        
        // At this stage, the output will be: C
        // We need to explicitly call each function for it to execute.
        
        fun1(); // Output: A
        fun2(); // Output: B
        
        // Calling a static method from another class using ClassName.method()
        Area1.area_1(); // Output: This is area_1 from class Area1
        
        // Using the static method from day3 class (imported from Day3 package)
        System.out.println("\nEnter a number to calculate the sum of first n natural numbers:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        day3.nsum(num); // Calls nsum() from Day3
        
        // If nsum were a non-static method, we would first create an instance of the class
        // Example: Creating an object of the Day4i class
        day4i naturalSumObj = new day4i();
        naturalSumObj.naturalsum(num); // Calling the non-static method
        
        // Demonstrating default values in Java
        naturalSumObj.x = 5; 
        System.out.println("Value of x: " + naturalSumObj.x); // Output: 5
        System.out.println("Value of y: " + naturalSumObj.y); // Output: 0 (default for int)
        
        // Uncommenting the line below will cause a compilation error because z is private
        // System.out.println(naturalSumObj.z); 

        sc.close(); // Closing Scanner to prevent resource leaks
    }
}

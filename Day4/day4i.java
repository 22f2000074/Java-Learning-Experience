package Day4;

public class day4i {
    // Instance method (non-static method), requires an object to be called.
    // Calculates the sum of the first 'n' natural numbers.
    void naturalsum(int n) {
        int final_sum = 0;
        for (int k = 0; k <= n; k++) {
            final_sum += k;
        }
        System.out.println("The sum of the first " + n + " natural numbers is " + final_sum);
    }

    // Instance variables (object-specific variables, initialized to default values).
    int x; // Default value: 0
    int y; // Default value: 0
    private int z; // Private variable, accessible only within this class.
    public void main(String [] args){ // note that static keyword is missing in main method.
        System.out.println(z);
    }
}

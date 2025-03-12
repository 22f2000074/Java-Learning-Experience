package Day4;

public class day4i {
    // non static function aka instance(object) member function
    // if there is a variable declared here it is instance(object) member variable
    void naturalsum(int n){
        int final_sum=0;
        for (int k=0;k<=n;k++){
            
            final_sum+=k;
        }
        System.out.println("The sum of first "+n+" natural numbers is "+final_sum);

    
    }
    int x; // instance member variable
    int y; // instance member variable
    private int z;
}

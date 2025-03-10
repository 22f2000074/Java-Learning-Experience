package Day3;

public class day3i {

    /*
      Pattern printing questions
      Pattern 1
      *****
      *****
      *****
      *****
    */
    public static void pattern1(){
        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    /*
      Pattern printing questions
      Pattern 2
      *****
      *   *
      *   *
      *****
    */
    public static void pattern2(){
        
    }

    public static void main(){
        System.out.println("Printing Pattern 1");
        pattern1();
    }
}

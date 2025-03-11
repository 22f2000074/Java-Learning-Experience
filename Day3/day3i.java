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
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /*
        Pattern 3 Half Pyramid
        *
        **
        ***
        ****
    */
    public static void pattern3(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(){
        System.out.println("Printing Pattern 1");
        pattern1();
        System.out.println("\nPrinting Pattern 2");
        pattern2();
        System.out.println("\nPrinting Pattern 3");
        pattern3();
    }
}

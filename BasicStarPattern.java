
import java.util.*;
public class BasicStarPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // square
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
            

        }
        System.out.println("");
        System.out.println("");


        // right triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
            


        }
        System.out.println("");
        System.out.println("");

//          inverted right triangle
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
            

        }
        System.out.println("");
        System.out.println("");

//       mirror right triangle
        for(int i=1;i<=n;i++){
            //s[+paces loop
            for(int k=1; k<=n-i;k++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
    



        }

System.out.println();
System.out.println();


        // mirror inverted right triangle
        for(int i=n;i>=1;i--){
            //s[+paces loop
            for(int k=1; k<=n-i;k++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
    



        }



    }



}
//* * *
//* * *
//* * *


// *
// * *
// * * *

//  * * *
//  * *
//  *




//      *
//    * *
//  * * *



//  * * *
//    * *
//      *

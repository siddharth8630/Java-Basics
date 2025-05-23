import java.util.Scanner;
public class largestamongthreevalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();


        System.out.println("enter the number");
        int b=sc.nextInt();


        System.out.println("enter the number");
        int c=sc.nextInt();

        // logic1
        // if(a>b&&a>c){
            // System.out.println(a+"  "+"a is the largest number");
        // }
        // else if(b>a && b>c){
            // System.out.println(b+"  "+"b is the largest number");
        // }
        // else{
            // System.out.println(c+"  "+"c is the largest number");
        // }
        // logic 2{ternary operator}

        int largest=a>b?a:b;//give largest value from a and b
        int largest1=c>largest?c:largest; //give the value from largest of c and largest1

        System.out.println(largest1+"  "+"is the largest number");
        

        

        



        
    }
    
}

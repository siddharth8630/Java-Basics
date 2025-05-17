
import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int ans=0;
        if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.print(a+" "+b);
        }
        else{
            System.out.print(a+" "+b+" ");
            for(int i=0;i<n-2;i++){
                ans = a + b;
                a = b;
                b = ans;
                System.out.print(ans+" ");
            }
        }
        
    }
}

// 0 1 1 2 3 5 8 13 21 34 55 89 134 194  258  377

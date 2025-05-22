import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a numbner");
        int num=sc.nextInt(); 

        // logic 1
        // int rev=0;
        // while(num!=0){
            // rev=rev*10+num%10;//0*10+1234%10=4  ;;;4*10+123%10=43  ;;;43*10+12%10=432 ;;;;   432*10+1%10=1
            // num=num/10;//1234/10=123  ;;;; 12  ;;;;  1

            // logic2{using stringbuffer class}
            // StringBuffer sb=new StringBuffer(String.valueOf(num));
            // StringBuffer rev1=sb.reverse();

            // logic3
             StringBuilder sbl=new StringBuilder();
            sbl.append(num);
           StringBuilder rev2=sbl.reverse();
        
            System.out.println("reverse a number"+ rev2);


        // }    
    }
    
}

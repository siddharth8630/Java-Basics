public class swap {
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("value before swapping....."+ a+"  "+b);
        // Logic 1
        int t=a;
         a=b;
         b=t;

        // logic2
        a=a+b;//10+20=30
        b=a-b;//30-20=10
        a=a-b;//30-10=20

        // logic3 {a and b value should not be zero}
        a=a*b;//10*20=200
        b=a/b;//200/10=20
        a=a/b;//200/20=10

        // logic4
        b=a+b-(a=b);//this bracket will resolve from right to left

        System.out.println("value after swapping....."+a+"   "+b);

        
        
    }

    
}

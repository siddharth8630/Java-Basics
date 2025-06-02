public class LinearSearch {
    public static void main(String[] args){
        int a[]={10,20,30,40,50,60}; 
        int search=50;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                System.err.println("element found at" +"    "+i);
                flag=true;
                break;
            }
        }
        if(!flag){
        System.out.println("element not found");}

    }
    
}
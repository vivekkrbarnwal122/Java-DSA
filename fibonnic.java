
import java.util.Scanner;

public class fibonnic {
    public static void main(String[] args) {
        int a=0,b=1,sum =0,i=0,count=0;
         System.out.print("enter no. of term to print fibonnic:");
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       System.out.println("fibonnic series :");
       //    System.out.println(a);
       //     System.out.println(b);
         

       while(count<n){
         System.out.println(a);
        sum=a+b;
        a=b;
        b=sum;
        count++;
        //i++;
    //System.out.println(a);
   }


   
  System.out.println("no._th position:"+count);  }
}
//Calculate Average Of N Numbers
import java.util.Scanner;
public class Average {    
    public static void main(String [] args){
    System.out.print("enter numbers: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int i=0 ,sum=0,x;
        while(i<num){
       x=in.nextInt();
         i++;    
        sum=sum+x;
    }
    double avg=(double)sum/num;
   // System.out.print(x+" "); 
    System.out.print("Average of given nums:  "+avg);       
}
}
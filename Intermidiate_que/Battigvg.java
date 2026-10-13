//Calculate Batting Average
import java.util.Scanner;
public class Battigvg {
    public static void main(String [] args){ 
    System.out.print("enter no. of innings: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("enter runs in " +num+ " innings");
        int i=0 ,sum=0,run;
        while(i<num){
       run=in.nextInt();
         i++;    
        sum=sum+run;}
        System.out.print("no. of outs: ");
    int out=in.nextInt();
    double avg ;   //variable declaration not allowed in if condition
    if(num>=out){
         avg=(double)sum/out;
   // System.out.print(x+" "); 
    System.out.print("Average of given nums:  "+avg);       }
else {
    System.out.println("Invalid number of outs");
}}}


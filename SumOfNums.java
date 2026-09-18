//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;

public class SumOfNums {
    public static void main(String [] args){
        System.out.print("enter number: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int i=0,sum=0;
        while(i<=num){
            sum=sum+i;  
        System.out.print(i+ " " );
        i++;
        }
        System.out.println();
        System.out.println("total sum:" +sum);}
}

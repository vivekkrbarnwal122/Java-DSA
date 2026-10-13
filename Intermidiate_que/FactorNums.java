//Input a number and print all the factors of that number (use loops).
import java.util.Scanner;
public class FactorNums{
    public static void main(String [] args){
        System.out.print("enter number: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.print("factors are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+ " ");
            }

        }
         System.out.println("end of program");
    }
}
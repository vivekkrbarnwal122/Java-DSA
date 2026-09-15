//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        int result=0;
        System.out.print("enter num:");
        Scanner in=new Scanner(System.in);
            int num=in.nextInt();
            int num1=num;
            while(num>0){
               int rem=num%10;
            //    num=num/10;
                result=result*10+rem;
                num=num/10;
               
            }
            if(num1==result){
                System.out.println(num1+" is palindrone");
            }
            else{
               System.out.println(num1+" is not palindrone"); 
            }

        }
    }


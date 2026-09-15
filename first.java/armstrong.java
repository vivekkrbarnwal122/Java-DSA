//To find Armstrong Number between two given number.
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        System.out.print("enter num:");
        int rem,result=0 ,Q, count=0;
        System.out.print("enter num:");
        Scanner in=new Scanner(System.in);
            int num=in.nextInt();
            int num1=num;
           
       int temp=num;
       while(temp>0){
        temp=temp/10;
        count++; 
       }
            while(num>0){
                
                 rem=num%10;
                 Q = (int)Math.pow(rem, count);
                 result =result+Q;
                 num=num/10;

    }
    if(num1==result){
        System.out.println(num1+" is armstrong number");
    }
    else{
        System.out.println(num1+" is not a armstrong number"); 
    }}}

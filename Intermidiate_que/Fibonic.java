import java.util.Scanner;
public class Fibonic {
 public static void main(String[] args) {
        //System.out.println(13839/10);
        System.out.print("enter no.: ");
        int a=0,b=1,sum=0,i;
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=0;i<n;i++){
            
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" " );
        }

 }}

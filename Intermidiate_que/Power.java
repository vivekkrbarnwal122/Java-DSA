import java.util.Scanner;

public class Power {
    public static void main(String [] args ){
    System.out.print("enter numbers: ");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.print("enter power numbers: ");
         int p=in.nextInt();
       double  power=Math.pow(num,p);
       System.out.println("result: "+power);


    }
}

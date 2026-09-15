
import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        //System.out.println(13839/10);
        System.out.println("enter no.:");
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int t =in.nextInt();
        int count=0;
        while(n>0){
        if(n%10==t){
            count++;
             n=n/10;

        }
       else{
        n=n/10;
       }

        }
System.out.println("no. of terms:-"+count);
    }
}

import java.util.Scanner;

public class reverseNums{
     public static void main(String[] args) {
        //System.out.println(13839/10);
        System.out.println("enter no.:");
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        //int t =in.nextInt();
        int rev_num=0,rem;
        while(n>0){
           rem=n%10;
            rev_num= rev_num*10+rem;
            n=n/10;
        // if(n%10==t){
        //     count++;
        //      n=n/10;

        }
    //    else{
    //     n=n/10;
    //    }

        
System.out.println("after reversing:-"+  rev_num);
    }}


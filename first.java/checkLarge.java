//Take 2 numbers as input and print the largest number.
 import java.util.Scanner;
public class checkLarge {
    public static void main(String[] args) {
        System.out.println("value of A and B:  ");
         Scanner in = new Scanner(System.in);
    int A=in.nextInt();
    int B=in.nextInt();
    if(A>B){
        System.out.println(A+ " larger than " +B);
    }
    else if (A==B){
        System.out.println(A+ " equal to " +B);
    }
    else{
        System.out.println(B+ " larger than "+B );
    }
}}

//package first.java;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SI {
   public static void main(String[] args){
    System.out.print("value od P R,T: ");
    Scanner in = new Scanner(System.in);
    int P=in.nextInt();
    int R=in.nextInt();
    int T=in.nextInt();
    float SI=(P*R*T)/100;
    System.out.println("Simple interest:"+SI);
   } 
}

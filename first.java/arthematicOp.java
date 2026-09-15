//package first.java;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class arthematicOp {
    public static void main(String[] args) {
        System.out.println("value of A and B:  ");
         Scanner in = new Scanner(System.in);
    int A=in.nextInt();
    int B=in.nextInt();
    System.out.println("add:"+(A+B));
     System.out.println("sub:"+(A-B));
      System.out.println("mul:"+(A*B));
       System.out.println("div:"+(float)(A/B));
    }
}

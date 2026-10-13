//with return type and without parameters
package Functionn;
import java.util.Scanner;
public class sum2 {
    public static void main(String[] args){
      int ans=  sum();//func call
      System.out.println(ans);
    }
    //func defination and declaration
static int sum(){
    System.out.print("enter num1: ");
    Scanner in=new Scanner(System.in);
    int num1=in.nextInt();
    System.out.print("enter num2: ");
    int num2=in.nextInt();
    int Sum =num1+num2;
    return Sum; //after  return we can't writting anythings

}
}
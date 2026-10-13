//without return type and without parameters taken input from user
package Functionn;
import java.util.Scanner;

public class sum1 {
    public static void main(String[] args){
        sum();//func call
    }
    
//func declaration and defination
static void sum(){
    System.out.print("enter num1: ");
    Scanner in=new Scanner(System.in);
    int num1=in.nextInt();
    System.out.print("enter num2: ");
    int num2=in.nextInt();
    System.out.println("sum:"+(num1+num2));

}
}
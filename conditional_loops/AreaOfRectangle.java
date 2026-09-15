import java.util.Scanner;

public class AreaOfRectangle{
    public static void main(String[] args){
   System.out.println("enter the L abd B of rectangle: ");
   Scanner in=new Scanner(System.in);
   int L=in.nextInt();
   int B=in.nextInt();
   double Area=.5*L*B;
   System.out.println("Area of rectangle: "+ Area);
    }
}
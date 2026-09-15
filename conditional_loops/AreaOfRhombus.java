import java.util.Scanner;

public class AreaOfRhombus {
public static void main(String[] args){
   System.out.println("enter the value D1 and D2 of rhombus: ");//D1-->diagonal 1st and D2-->Diagonal 2nd
   Scanner in=new Scanner(System.in);
   int D1=in.nextInt();
   int D2=in.nextInt();
   double Area=.5*D1*D2;
   System.out.println("Area of rectangle: "+ Area);
    }
}


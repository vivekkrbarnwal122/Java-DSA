import java.util.Scanner;
public class AreaOfTriangle {
  public static void main(String[] arg){
    System.out.println("Enter the L and B of a triangle: ");
    Scanner in =new Scanner(System.in);
    int length=in.nextInt();
    int breadth=in.nextInt();
    double Area=.5*length*breadth;
    System.out.print("Area of a triangle: "+Area);
  }
}

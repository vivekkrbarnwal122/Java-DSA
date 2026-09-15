import java.util.Scanner;

public class AreaOfEquilqteral {
    public static void main(String[] arg){
    System.out.print("Enter the side of triangle: ");
    Scanner in =new Scanner(System.in);
    int Side=in.nextInt();
    double Area=(1.732/4)*Side*Side;
    System.out.print("Area of a triangle: "+Area);
  }
}


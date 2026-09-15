import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
    System.out.print("enter the radius of circle: ");
    Scanner in =new Scanner(System.in);
    int r=in.nextInt();
    double Area=3.14*r*r;
    System.out.println("Area OF CIRCLE " +Area);
  
    }

}

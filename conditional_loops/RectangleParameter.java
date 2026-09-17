 //parameter of parallelogram and rectangle
 import java.util.Scanner;
   public class RectangleParameter {
    public static void main(String[] args){
        System.out.println("enter length and width of rectangle: ");
        Scanner in =new Scanner(System.in);
        int L= in.nextInt();
        int W= in.nextInt();
        double perimeter=2*(L+W);
        System.out.println("Perimeter of Rectangle : "+perimeter);

    }
}
 


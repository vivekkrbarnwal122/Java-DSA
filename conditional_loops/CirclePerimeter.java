import java.util.Scanner;
public class CirclePerimeter {
    public static void main(String[] args){
        System.out.println("enter radius of circle: ");
        Scanner in =new Scanner(System.in);
        int r= in.nextInt();
        double perimeter=2*3.14*r;
        System.out.println("Perimeter of circle : "+perimeter);

    }
}

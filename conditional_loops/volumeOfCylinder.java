import java.util.Scanner;
public class volumeOfCylinder {
        public static void main(String[] args){
        System.out.println("enter height and radius of Cylinder : ");
        Scanner in =new Scanner(System.in);

        int h = in.nextInt();
        int r = in.nextInt();
        double volume=(3.14)*r*r*h;
        System.out.println("volume of Cylinder  : "+volume);

    }
}
 





 


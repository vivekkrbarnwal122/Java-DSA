//Take integer inputs till the user enters 0 and print the largest number from all.
// import java.util.Scanner;
// public class FindLargest {
//         public static void main(String [] args){
//         System.out.print("enter number: ");
//         Scanner in=new Scanner(System.in);
//         int num=in.nextInt();
//         int i=0 ;
//         while(i<=num){
//          int x=in.nextInt();
//          i++;    
//        System.out.print(x+" ");  
//        int temp=0;
//        if(temp>x)  {
//        x=temp;}}
//        System.out.print(x+" ");    
//     }     
// }
import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        int largest = num;

        while (num != 0) {

            if (num > largest) {
                largest = num;
            }

            num = in.nextInt();
        }

        System.out.println("Largest number = " + largest);
    }
}
//Calculate Commission Percentage
import java.util.Scanner;
public class Comission {
     public static void main(String [] args){
System.out.print("enter total sales : ");
Scanner in=new Scanner(System.in);
int total_sales =in.nextInt();
System.out.print("enter commision: ");
int commision=in.nextInt();
if(commision<total_sales && commision>0){
   double commision_percentage=((double)commision/total_sales)*100;
   System.out.println("commision % :  "+commision_percentage );
//    float final_price=price-discount_price;
//    System.out.println("final price after discount: "+final_price);

}
else{
    System.out.print("please enter right commision amount ");
}
    }
}


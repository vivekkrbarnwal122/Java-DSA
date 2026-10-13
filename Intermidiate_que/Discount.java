//Calculate Discount Of Product
import java.util.Scanner;
public class Discount {
    public static void main(String [] args){
System.out.print("enter Original price: ");
Scanner in=new Scanner(System.in);
int price =in.nextInt();
System.out.print("enter discount %: ");
int discount=in.nextInt();
if(discount<100){
   float  discount_price=(float)(price/100.0f)*discount;
   System.out.println("Discount price: "+discount_price);
   float final_price=price-discount_price;
   System.out.println("final price after discount: "+final_price);

}
else{
    System.out.print("please enter right discounted amount ");
}
    }
}

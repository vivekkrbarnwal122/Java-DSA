//package first.java;
//Input currency in rupees and output in USD.
import java.util.Scanner;
public class RupiesToUsd {  
      public static void main(String[] args){
        System.out.print("enter Rupies: ");
        Scanner in=new Scanner(System.in);
        long rupies=in.nextInt();
         System.out.print("enter exchange rate: ");
        float exchange_rate=in.nextFloat();
         //System.out.print("enter exchange rate: ");
        float USD=rupies/exchange_rate;
            System.out.println(rupies+ " rupies in USD value :"+USD);
        }
       
       }

   



//package Functionn;

import java.util.Scanner;

public class Isprime {
    public static void main(String [] args){
        Isprime();
    }
    
  static void Isprime(){
    System.out.print("enter num: ");
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int i=2;
    boolean prime=true;
    while(i<num){
        if(num%i==0){
            i++;
         prime =true;
        }
       else {
        prime=false;
     }
    }
    if(prime){
        System.out.println("prime");
    }
else
  System.out.println("not prime");}}
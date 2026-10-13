import java.util.Scanner;
public class DistanceFind { 
     public static void main(String [] args){
System.out.print("enter 1st point value (x1,y1):  ");
Scanner in=new Scanner(System.in);
int x1=in.nextInt();
int y1=in.nextInt();
System.out.print("enter 2nd point value (x2,y2):  ");
int x2=in.nextInt();
int y2=in.nextInt();
double distance= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
System.out.println("Distance b/w two points: "+distance );
    }}
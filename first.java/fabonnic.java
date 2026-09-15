import java.util.Scanner;
public class fabonnic {

    public static void main(String[] args){
        int a=0,b=1,sum=0,count=0;
        System.out.println("no. of term to print fabonnic series: ");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        for( ;count<num;count++){
        System.out.println(a);
        sum=a+b;
        a=b;
        b=sum;
        }
        System.out.println("nth term no.: "+ count);
    }
}

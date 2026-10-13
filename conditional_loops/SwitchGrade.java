import java.util.Scanner;
public class SwitchGrade {
    public static void main(String[] args) {
        System.out.print("enter obtained marks:");
        Scanner in=new Scanner(System.in);
        int marks=in.nextInt();
        switch(marks/10){
            case 9:
                System.out.println("O grade");
                break;
                 case 8:
                System.out.println("A grade");
                break;
                 case 7:
                System.out.println("B grade");
                break;
                 case 6:
                System.out.println("C grade");
                break;
                 case 5:
                System.out.println("D grade");
                break;
                case 3:
                case 4:
                
                System.out.println("pass");
                break;
                 case 2:
                case 1:
                System.out.println("fail");
                break;
                default:
                    System.out.println("overlapped");



       



        }


    }
}

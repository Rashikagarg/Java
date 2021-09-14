import java.util.*;
public class display_days {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num = sc.nextInt();
        switch (num){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tueday");break;
            case 3: System.out.println("Wedday");break;
            case 4: System.out.println("Thuday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Satday");break;
            case 7: System.out.println("Sunday");break;
            default:   System.out.println("Not a valid number");
        }
    }
    
}

import java.util.Scanner;
import java.lang.*;
 public class Area_of_triangle {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("Enter the height : ");
Float h=sc.nextFloat();
System.out.println("Enter the base : ");
Float b=sc.nextFloat();
Float area=b*h*0.5f;
System.out.println("Area of Triangle is : "+area);


    }
}

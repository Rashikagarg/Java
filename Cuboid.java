import java.lang.*;
import java.util.Scanner;
public class Cuboid {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int l,h,b;
        System.out.println("Enter the lenght,breadth,height");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        int volume=l*b*h;
        int totalArea=2*(l*b+l*h+b*h);
        System.out.println("Total area "+totalArea);
        System.out.println("Volume "+ volume);
    }
}

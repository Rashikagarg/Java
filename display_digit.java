import java.util.Scanner;
public class display_digit {
    public static void main(String arg[]){
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int no= sc.nextInt();
    while(no>0){
        r=no%10;
        no=no/10;
        System.out.println(r);
    }

    }
}

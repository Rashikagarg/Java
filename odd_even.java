import java.util.Scanner;
public class odd_even {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no=sc.nextInt();
    if(no%2==0){
    System.out.println("No. is even = "+ no);
}
else{
    System.out.println("No. is odd = " + no);
}
    }
}

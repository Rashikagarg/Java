import java.util.*;

public class radix_of_a_given_no_in_a_string {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check radix");
        String no=sc.nextLine();
if(no.matches("[0-1]+")){
    System.out.println("Binary Radix = 2");
}
else if(no.matches("[0-7]+")){
    System.out.println("Octal Radix = 8");
}
else if(no.matches("[0-9]+")){
    System.out.println("Decimal Radix = 10");
}
else if(no.matches("[0-9A-F]")){
    System.out.println("Hexa Decimal Radix = 16");
}
else{
    System.out.println("not a number");

}
    }
}
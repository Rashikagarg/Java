import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        int rev=0,r,m;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
m=no;
while(no>0){
    r=no%10;
    no=no/10;
    rev=rev*10+r;
}
if(rev==m)
System.out.println("No is palindrome " + m);
else
System.out.println("No is not palindrome " + m);
    }
}

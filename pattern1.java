import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        System.out.println("Enter the value of y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(j + " ");
            }
            System.out.println( " ");
        }
    }
}

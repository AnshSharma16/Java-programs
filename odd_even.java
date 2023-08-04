
import java.util.Scanner;
public class odd_even {
    public static void main(String args[]) {
        int num;
        Scanner obj;
        obj=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=obj.nextInt();
        if(num%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");

        
    }
    
}

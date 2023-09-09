import java.util.Scanner;
import java.math;
public class Palindrome{
    public static void main(String[]args){
        int n,rem,rev=0,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
                while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
            

        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
    }
    
}


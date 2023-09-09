import java.util.Scanner;
public class ProductOfDigits{
    public static void main(String[]args){
        int rem,p=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            rem=n%10;
            n=n/10;
            p=p*rem;
            
        }
System.out.println(p);
    }

    
}


import java.util.Scanner;
public class FirstLastDigit {
    public static void main(String[]args){
  Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int temp,rem,r;
        temp=n;
r=n%10;
System.out.println(r);
        while (n!=0){
           rem=n%10;
           n=n/10;
        if(n<10 && n!=0){
            System.out.println(n);
           
           }
           


        }
        
    }
    
}

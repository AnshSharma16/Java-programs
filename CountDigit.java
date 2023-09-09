import java.util.Scanner;
public class CountDigit{
    public static void main( String[]args){
        Scanner sc=new Scanner(System.in);
        int count=0,i=0,rem=0, n=sc.nextInt();
        while(n!=0){
            n=n/10;
            count++;
            

        }
        System.out.println(count);
    }
    
    
}

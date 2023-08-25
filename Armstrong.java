import java.Math.lang;
import java.util.Scanner;
public class Armstrong{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n,sum=0;
    n=sc.nextInt();
    int temp=n;
    

    while(n!=0){
        int rem1=n%10;
        sum+=Math.pow(rem1,3);
        n=n/10;



    }

    if(temp==sum){
        System.out.println("Armstrong");
    }
    
else{
    System.out.println("Not Armstrong");
}

    }
    
}

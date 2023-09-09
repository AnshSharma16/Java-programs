import java.util.Scanner;  
public class SumNumber
{  
public static void main(String[] args)   
{  
int number, i=0, sum=0;
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
number = sc.nextInt();    
System.out.print("Sum of numbers: ");  
for(i=0;i<=number;i++) 
{  
sum=sum+i;
}     
System.out.println(sum);
}  
}
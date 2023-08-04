import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args) {
        int n,first=0,sec=1,next;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter range: ");
n=obj.nextInt();
while(first<=n){
  next=first+sec;
  first=sec;
  sec=next;

System.out.println( next);

}
}
}

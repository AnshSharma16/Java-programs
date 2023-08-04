/*import java.util.Scanner;
public class Temp{   
       public static void main(String[]args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=obj.nextInt();
        
       for ( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");}
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");}
                    System.out.println();
                }

                
          for(int i=1;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*(i-1)+1;j++){
                       if(j==1 || j==2*(i-1)+1 || i==n)
                        System.out.print("*");
                        else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
            }
}
                  }        */
    
import java.util.Scanner;
import java.lang.Math;
public class Temp{
    public static void main(String[]args){
        Scanner obj;
        obj=new Scanner(System.in);
         int a,b;
        a=obj.nextInt();
        b=obj.nextInt();
        if(a>b)
        System.out.println(a+"is greater");
        if (b>a)
        System.out.println(b+"is greater");
        else
        System.out.println("Equal");
    }
}
/*int r=obj.nextInt();
double A=Math.PI*r*r;
System.out.println(A);*/







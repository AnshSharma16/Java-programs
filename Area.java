import java.util.Scanner;
public class Area{
    

 
static double area_r(int l,int b){
    
        double arear=l*b;
        
        System.out.println(arear);
        return arear;
    }

    static double area_c(int r){
    
        double areac=3.14*r*r;
        
        System.out.println(areac);
        return areac;
    }
 

    public static void main(String []args){
        Scanner sc;
       sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r=sc.nextInt();
        System.out.println("Enter the length of rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int b=sc.nextInt();
      
      
        area_c(r);
        area_r(l,b);
        
    }

}

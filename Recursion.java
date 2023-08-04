/*public class Recursion {
    static int i=0;
    static void p(){
        i++;
        if(i<=5){
            System.out.println(i);
            p();
        }
    }
    public static void main(String[]args) {
        p();
        
    }
}*/

public class Recursion{
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
    public static void main(String[]args) {
       System.out.println(fact(3));
    }
}


import java.util.Scanner;
public class calculator{
    public static void main(String[]args) {
        String op;
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the operator:");
        op=obj.nextLine();

        switch (op) {
            case "+":
            System.out.println("Enter two operands: ");
            a=obj.nextInt();
            b=obj.nextInt();
            System.out.println("Sum is "+(a+b));
            break;

            case "-":
            System.out.println("Enter two operands: ");
            a=obj.nextInt();
            b=obj.nextInt();
            System.out.println("Difference is "+(a-b));
            break;

            case "*":
            System.out.println("Enter two operands: ");
            a=obj.nextInt();
            b=obj.nextInt();
            System.out.println("Product is "+(a*b));
            break;

            case "/":
            System.out.println("Enter two operands: ");
            a=obj.nextInt();
            b=obj.nextInt();
            System.out.println("Quotient is "+(a/b));
            break;

            case "pow":
            System.out.println("Enter number: ");
            a=obj.nextInt();
            System.out.println("Enter power: ");
            b=obj.nextInt();
            System.out.println(Math.pow(a,b));
            break;
        
            case "sqrt":
            System.out.println("Enter a number: ");
            a=obj.nextInt();
            System.out.println("Square root is "+Math.sqrt(a));
            break;
         
            case "exp":
            System.out.println("Enter a number: ");
            a=obj.nextInt();
            System.out.println("Exponential value is "+Math.exp(a));
            break;

            default:
            System.out.println("Please enter a valid operator");
                break;
        }

    }
    
}

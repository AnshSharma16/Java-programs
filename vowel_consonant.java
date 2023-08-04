import java.util.Scanner;
public class vowel_consonant{
     public static void main(String[] args) {
        

        String ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter english alphabets: ");
        ch=obj.nextLine();

        switch (ch) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            System.out.println("Vowel");
            break;

            default:
            System.out.println("Consonant");
                
        }
    } 
    
}

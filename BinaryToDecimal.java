import java.text.DecimalFormat;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s[]=sc.next().split("");
		int arr[]=new int[s.length];double c,d,pro,sum=0;
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			arr[i]=Integer.parseInt(s[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			count++;
		}
        for(int i=0;i<arr.length;i++){
           c=Math.pow(2,i);
           d=arr[(count-1)-i];
           pro=c*d;
           sum=sum+pro;

        }
        DecimalFormat format = new DecimalFormat("0.#");

        
		System.out.println(format.format(sum) );
        
    }
}
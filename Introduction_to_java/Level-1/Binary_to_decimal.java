/**
 Question:
 Given a binary number as an integer N, convert it into decimal and print.
 */
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int length = String.valueOf(n).length();
        for(int i=0; i<length; i++){
            if(n%10 != 0)
                sum+=Math.pow(2,i);
            
            n/=10;
        }
        System.out.println(sum);
        
	}
}

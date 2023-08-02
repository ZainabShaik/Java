package Factorial;
import java.util.Scanner;
/**@author zainab
 *  20-07-2023
 */
public class Fact {
/**
 * 
 * 
 * main method
 * 
 * @param args
 * file opening
 */
	public static void main(String []args) {
	Scanner scan=new Scanner(System.in);

	System.out.println("enter the number");
	int n=scan.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println("the factorial of the number is"+fact);
	scan.close();
}
}

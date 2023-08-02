import java.util.Scanner;
public class PalindromeApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number to check palindrome");
	int n=scan.nextInt();
	Palindrome palindrome=new Palindrome();
	int res=palindrome.checkPalindrome(n);
	if(res==n) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}

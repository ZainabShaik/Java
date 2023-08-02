import java.util.Scanner;
public class Solution1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scan.nextInt();
	number(n);
}
public static void number(int n) {
	for(int i=1;i<=n;i++) {
		if(n%2==0) {
			System.out.println(i);
		} 
	}
}
}

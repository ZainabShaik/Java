import java.util.Scanner;
public class PrimeNumber {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	for(int i=0;i<=n;i++) {
		if(n%2==0) {
			System.out.println("number "+n+" is not prime");
			return;
		}
		else {
			System.out.println(n+" is prime");
		    return;
		}
	}
	scan.close();
}
}

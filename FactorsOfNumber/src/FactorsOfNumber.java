import java.util.Scanner;
public class FactorsOfNumber {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	int factor=1;
	System.out.println("factors of the number");
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
}
}

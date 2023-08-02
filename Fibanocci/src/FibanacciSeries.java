import java.util.Scanner;
public class FibanacciSeries {
	public static void fibanacciSeries(int n) {
		int fib1=0,fib2=1;
		if(n==1) {
			System.out.println(fib1+" ");
		}
		else if(n==2)
		{
			System.out.print(fib1+" "+fib2);
		}
		else {
		System.out.print(fib1+" "+fib2+" ");
		for(int i=3;i<=n;++i) {
			int nextNo=fib1+fib2;
			System.out.print(nextNo+" ");
			fib1=fib2;
			fib2=nextNo;
		}
		
	}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number upto which you want to print the series");
	int n=scan.nextInt();
	fibanacciSeries(n);
}
}

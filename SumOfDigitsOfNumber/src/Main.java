import java.util.Scanner;
public class Main {
	public static void calculateSumOfDigits(int n) {
		int sum=0;
        while(n!=0) {
        	int rem=n%10;
            sum=sum+rem;
        	n=n/10;
        }
        System.out.println(sum);
		}
	
		public static void main(String[] args)
		{
		int rem;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		calculateSumOfDigits(n);
		}
}

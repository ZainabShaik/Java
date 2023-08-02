import java.util.Scanner;
public class Main {
	public static void calculateSumOfSeries(int n)
	{ 
		double sum=0.0;
		for(int i=1;i<=n;i++) {
			sum=sum+1.0/i;
		}
		System.out.println("sum of the series of "+n+" is "+sum);
	}
	

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the number upto how much you want to make the series");
      int n=scan.nextInt();
      calculateSumOfSeries(n);
      
	}

}

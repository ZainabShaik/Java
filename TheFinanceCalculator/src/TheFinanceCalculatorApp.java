import java.util.Scanner;
public class TheFinanceCalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter principal,rate and time");
	Double principal=scan.nextDouble();
	Double rate=scan.nextDouble();
	Double time=scan.nextDouble();
	
	TheFinanceCalculator calculator = new TheFinanceCalculator();
	System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));
	scan.close();
}
}

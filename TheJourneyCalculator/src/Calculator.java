import java.util.Scanner;
public class Calculator {
public static void main(String []ars) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the speed and time as real numbers");
	Double speed=scan.nextDouble();
	Double time=scan.nextDouble();
	JourneyCalculator journeyCalculator = new JourneyCalculator();
	System.out.printf("%.2f",journeyCalculator.calculateDistance(speed,time));
	scan.close();
}
}

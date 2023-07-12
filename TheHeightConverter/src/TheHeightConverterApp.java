import java.util.Scanner;

public class TheHeightConverterApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the inches");
	TheHeightConverter converter = new TheHeightConverter();
	int inches=scan.nextInt();
	System.out.printf("%.2f",converter.convertInchesToFeet(inches));
    scan.close();
}
}

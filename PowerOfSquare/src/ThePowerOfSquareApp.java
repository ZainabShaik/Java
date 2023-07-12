import java.util.Scanner;

public class ThePowerOfSquareApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	System.out.println(ThePowerOfSquare.squareNumber(num));
	scan.close();
}
}

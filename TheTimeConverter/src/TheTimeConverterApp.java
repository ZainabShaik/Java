import java.util.Scanner;
public class TheTimeConverterApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the employee log in time in minutes");
	int minutes=scan.nextInt();
	System.out.println(TheTimeConverter.convertToHours(minutes));
	scan.close();
}
}

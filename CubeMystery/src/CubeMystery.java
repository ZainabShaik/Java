import java.util.Scanner;

public class CubeMystery {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	
	System.out.println(CubeMysteryApp.cubeNumber(num));
	scan.close();
}
}

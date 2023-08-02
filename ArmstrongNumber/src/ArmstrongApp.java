import java.util.Scanner;
public class ArmstrongApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	Armstrong armstrong=new Armstrong();
	int res=armstrong.findArmstrong(n);
	if(n==res) {
		System.out.println("number is armstrong");
	}
	else {
		System.out.println("number is not armstrong");
	}
}
}

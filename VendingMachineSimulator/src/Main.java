import java.util.Scanner;
public class Main {
	public static void getProduct(String productCode)
	{
	switch(productCode) {
	case "P01":
		System.out.println("COCA COLA");
	break;
	case "P02":
		System.out.println("SPRITE");
	break;
	case "P03":
		System.out.println("PEPSI");
	break;
	default:
		System.out.println("it is not a soft drink");
	}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the productcode P01--->COCA COLA  P02---->SPRITE  PO3--->PEPSI");
		String productCode=scan.next();
		getProduct(productCode);
		
	}
}

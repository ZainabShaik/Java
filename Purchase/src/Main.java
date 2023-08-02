import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the purchased ammount");
      double purchaseAmount=scan.nextDouble();
      checkDiscount(purchaseAmount);
	}
	public static void checkDiscount(double purchaseAmount)

	{ // your code here
      if(purchaseAmount>=100) {
    	  System.out.println("Discount Applicable");
      }
      else {
    	  System.out.println("Discount not Applicable");
      }
	}
}

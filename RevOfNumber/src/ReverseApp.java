import java.util.Scanner;
public class ReverseApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the number you want to reverse it");
	    int n=scan.nextInt();
	    Reverse reverse=new Reverse();
	    int res=reverse.findRev(n);
	    System.out.println(res);
	}
     
     
}

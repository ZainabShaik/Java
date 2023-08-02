import java.util.Scanner;
public class ApproachApp2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	int original=num;
	int count=0;
	while(num!=0) {
		num=num/10;
		count++;
	}
	Armstrong armstrong=new Armstrong();
	int res=armstrong.sumOfDigitsRaisedByPower(original,count);
	System.out.println(res);
	if (res==original) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("not armstrong");
	}
}
}

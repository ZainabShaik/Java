
public class NumberDivisible {
    public static void numberTwo(int n) {
	  for(int i=1;i<n;i++) {
	      if(n%2==0) {
		     System.out.println(i+ "numbers are divisible by 2");	
	     }
     }
    }
	public static void numberThree(int n) {
		for(int i=1;i<n;i++) {
		if(n%3 ==0) {
			System.out.println(i+ "numbers are divisible by 3");	
		}
		}
	}
	public static void numberFour(int n) {
		for(int i=1;i<n;i++) {
		if(n%5 ==0) {
			System.out.println(i+ "numbers are divisible by 5");	
		}
		}
	}
	public static void numberTwoFive(int n) {
		for(int i=1;i<n;i++) {
		if(n%2==0 && n%5==0) {
			System.out.println(i+ "numbers are divisible by 3");	
		}
		}
	}
	public static void numberThreeTable5(int n) {
		for(int i=1;i<n;i++) {
		if(n%3 ==0) {
			if(n%5==0)
			System.out.println(i+ "numbers are divisible by 3 and comes in 5 table");	
		}
		}
	}
}


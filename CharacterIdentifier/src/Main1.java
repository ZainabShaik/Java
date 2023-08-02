import java.util.Scanner;
public class Main1 {
	public static void identifyCharacter(char ch)
	{
      if(Character.isDigit(ch)) {
    	  System.out.println("entered character "+ch+" is Digit");
      }
      else if(!Character.isLetter(ch)) {
    	  System.out.println("entered character "+ch+" is special character");
      }
      else {
    	  switch(Character.toLowerCase(ch)) {
    	  case 'a':
    	  case 'e':
    	  case 'i':
    	  case 'o':
    	  case 'u':
    	  if(Character.isLowerCase(ch)) {
    		  System.out.println("entered character "+ch+" is lower case vowel");
    	  }
    	  else {
    		  System.out.println("entered character "+ch+" is upper case vowel");
    	  }
    	  break;
    	  default:
    		  if(Character.isLowerCase(ch)) {
    			  System.out.println("entered character "+ch+" is lowercase consonant");
    		  }
    		  else {
    			  System.out.println("entered character "+ch+" is upper case consonant");
    		  }
    	  }
      }

	}

	public static void main(String[] args)

	{
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a character");
      char ch=scan.next().charAt(0);
      identifyCharacter(ch);
	}
}

import java.util.Scanner;
public class MessageApp {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the character");
	char c=scan.next().charAt(0);
	MessageDecoder decoder = new MessageDecoder();
	System.out.println(decoder.decodeCharacter(c));
	scan.close();
}
}
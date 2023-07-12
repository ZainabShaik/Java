import java.util.Scanner;
public class ThePlanetExplorerApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the radius");
	Double radius=scan.nextDouble();
	ThePlanetExplorer explorer = new ThePlanetExplorer();

	System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
	scan.close();
}
}

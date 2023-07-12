import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the temp F");
		Double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		scan.close();
	}

}

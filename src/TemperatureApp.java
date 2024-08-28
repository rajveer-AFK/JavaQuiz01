import java.util.Scanner;

public class TemperatureApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring variable to store user entered temperature
		double user_fahrenheit;
		
		// Creating the scanner object to collect user data
		Scanner input = new Scanner(System.in);
		
		// Prompting the user for temperature and storing it
		System.out.println("Enter a temperature in Fahrenheit: ");
		user_fahrenheit = input.nextDouble();
		
		// Creating an object of the Quiz1Class and outputting the temperature (not rounded)
		Quiz1Class userTemperature = new Quiz1Class(user_fahrenheit); 
		System.out.println(userTemperature.toString());
	}

}

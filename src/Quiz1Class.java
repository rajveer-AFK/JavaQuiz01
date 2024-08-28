
public class Quiz1Class {
	
	private double temp_fahrenheit;
	
	public Quiz1Class(double temp_fahrenheit)
	{
		this.temp_fahrenheit = temp_fahrenheit;
	}

	public double getTemp_fahrenheit() {
		return temp_fahrenheit;
	}

	public void setTemp_fahrenheit(double temp_fahrenheit) {
		this.temp_fahrenheit = temp_fahrenheit;
	}
	
	
	public double convertToCelsius()
	{
		double celsius = ((double)5/9) * (this.temp_fahrenheit - 32);
		return celsius;
	}
	
	@Override
	public String toString()
	{
		String str = "Temperature in Fahrenheit: " + temp_fahrenheit +
					 "\nTemperature in Celsius: " + convertToCelsius();
		return str;
	}
	
	
}

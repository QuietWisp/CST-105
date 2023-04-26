import java.util.Scanner;
import java.io.*;

public class MainDriver {

	public static void main(String[] args) 
	{
		//Scanner setup
		Scanner scnr = new Scanner(System.in);
		
		//Fahrenheit and celsius variables
		double fahrenheit; 
		double celsius;

		//Fahrenheit temperature
		System.out.print("Enter a Fahrenheit temperature: ");
		
		//Fahrenheit user input
		 fahrenheit = scnr.nextDouble();
		
		//Fahrenheit to Celsius equation
		 celsius = (fahrenheit - 32) * 5 / 9;
		
		//Fahrenheit answer
		System.out.println(fahrenheit + "F" + " is equivalent to " + celsius + "C");
		
		
		//Break between Fahrenheit and Celsius
		System.out.println("");
		
		
		//Celsius temperature
		System.out.print("Enter a Celsius temperature: ");
		
		//Celsius user input
		celsius = scnr.nextDouble();
		
		//Celsius to Fahrenheit equation
		fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println(celsius + "C " + "is equivalent to " + fahrenheit + "F");
	}

}

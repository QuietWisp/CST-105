import java.util.Scanner;

public class MainDriver 
{
	public static void main(String[] args)
	{
		//Scanner setup
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a 5-digit positive integer: ");
		
		//User input
		int input = scanner.nextInt();
		
		//Calculates integer
		int firstNum = input % 10;
		int secondNum = input / 10 % 10;
		int thirdNum = input / 100 % 10;
		int fourthNum = input / 1000 % 10;
		int fifthNum = input / 10000 % 10;
		
		//Calculate total
		int total = firstNum + secondNum + thirdNum + fourthNum + fifthNum;
		
		//Prints result and addition process
		System.out.println("The sum of the digits is " + fifthNum + " + " + fourthNum + " + " + thirdNum + " + " + secondNum + " + " + firstNum + " = " + total);
	}
}

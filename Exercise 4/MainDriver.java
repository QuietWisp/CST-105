import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.text.NumberFormat;
import java.util.Locale;

public class MainDriver 
{
	public static void main(String[] args) 
			throws URISyntaxException, IOException
	{
		var fullPath = "InputData.txt";
		var currencyFormatter = NumberFormat.getCurrencyInstance(Locale.getDefault());
		
		var lineCount = 0; //number of contributions
		var minDonation = Integer.MAX_VALUE; //sets the minValue to the maxValue of the dataset to initialize and allow for the value to change
		var maxDonation = Integer.MIN_VALUE; //sets the maxValue to the minValue of the dataset to initialize and allow for the value to change
		var averageDonation = 0; //average contribution
		var totalDonation = 0; //total of contributions
		
		//Opens File
		var br = new BufferedReader (new FileReader(fullPath));
		
		String str;
		while ((str = br.readLine()) != null)
		{
			int lineDonation = Integer.parseInt(str); //Line donation is used in min/maxDonation
			totalDonation += Integer.parseInt(str); //Adds to total amount by using the += operator
			lineCount++; //Donation count used in min/maxDonation
			
			minDonation = Runner.Min(lineDonation, minDonation);
			maxDonation = Runner.Max(lineDonation, maxDonation);
			
			if (totalDonation >= 10000000)
			{
				break;
			}
		}	
		
		averageDonation = Runner.Avg(totalDonation, lineCount);
		
		//Close file
		br.close();

		System.out.printf("It took %d contributions to reach the goal.\n", lineCount);
		System.out.printf("The minimum contribution received was %s.\n", currencyFormatter.format(minDonation));
		System.out.printf("The maximum contribution received was %s.\n", currencyFormatter.format(maxDonation));
		System.out.printf("The average contribution amount was %s\n", currencyFormatter.format(averageDonation));
		System.out.printf("A total of %s was collected. \n", currencyFormatter.format(totalDonation));
		
		File output = new File("Output.txt");
		PrintWriter pw = new PrintWriter(output); //ACE center showed me that you can use PrintWriter to use printf
		pw.printf("It took %d contributions to reach the goal.\n", lineCount);
		pw.printf("The minimum contribution received was %s.\n", currencyFormatter.format(minDonation));
		pw.printf("The maximum contribution received was %s.\n", currencyFormatter.format(maxDonation));
		pw.printf("The average contribution amount was %s\n", currencyFormatter.format(averageDonation));
		pw.printf("A total of %s was collected. \n", currencyFormatter.format(totalDonation));
		
		pw.close();
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.Arrays;

public class MainDriver 
{
	public static void main(String[] args) 
		throws URISyntaxException, IOException
	{
		//Output code from: https://www.xmodulo.com/how-to-save-console-output-to-file-in-eclipse.html
		System.setOut(new PrintStream(new FileOutputStream("results.out")));
		
		var fullPath = "Input.in";
		var outputPath = "results.out";
		PrintWriter pw = new PrintWriter(outputPath);
		var br = new BufferedReader (new FileReader(fullPath));
		
		String str;		
		while ((str = br.readLine()) != null)
		{
			if (str.length() <= 0) //used to make sure that if any lines are empty, the program will still run (In File.io video #1)
			{
				continue;
			}
			
			//Lines 34-38 were referenced from `https://www.geeksforgeeks.org/read-file-into-an-array-in-java/#`
			String[] splitWords = str.split(" "); //splits the string array at whitespace
			for (String word : splitWords)//array of a string 
			{
				System.out.println(word);
			}
			
						
			System.out.println(); //spacer
			
			for (int i = 0; i < splitWords.length; i++)//for loop is used to run through the array
			{
				if (splitWords[i].length() % 2 == 0) //if word is even
				{
					int wordDivTwo = splitWords[i].length() / 2; //integer divides the word by two
					//substring code referenced from 'https://www.baeldung.com/string/substring'
					String halfOne = splitWords[i].substring(0, wordDivTwo); //first half of the word, substring(0-beginningIndex, endIndex)
					String halfTwo = splitWords[i].substring(wordDivTwo); //second half of the word
					splitWords[i] = halfTwo + halfOne; //second half + first half = splitWords[position]
				}
				
				else if (splitWords[i].length() % 3 == 0) //if word has 3 letters
				{
					int wordDivThree = (splitWords[i].length() + 1) / 2; //adds plus one to the length, then divides by two  
					String halfThree = splitWords[i].substring(0, wordDivThree); //First two letters 'AL
					String halfFour = splitWords[i].substring(wordDivThree); //Last letter 'L'
					splitWords[i] = halfFour + halfThree; //LAL
				} 	
								
				else if (splitWords[i].length() % 5 == 0)//if word has 5 letters
				{
					int wordDivThree = (splitWords[i].length() + 1) / 2;
					String halfThree = splitWords[i].substring(0, wordDivThree);
					String halfFour = splitWords[i].substring(wordDivThree);
					splitWords[i] = halfFour + halfThree;
				} 
				
			else if (splitWords[i].length() % 7 == 0)//if word  has 7 letters
				{
					int wordDivThree = (splitWords[i].length() + 1) / 2;
					String halfThree = splitWords[i].substring(0, wordDivThree);
					String halfFour = splitWords[i].substring(wordDivThree);
					splitWords[i] = halfFour + halfThree;
				} 
				
			else if (splitWords[i].length() % 9 == 0)//if word has 9 letters
			{
				int wordDivThree = (splitWords[i].length() + 1) / 2;
				String halfThree = splitWords[i].substring(0, wordDivThree);
				String halfFour = splitWords[i].substring(wordDivThree);
				splitWords[i] = halfFour + halfThree;
			} 
				
				System.out.println(splitWords[i].toUpperCase());
			}
	
		}
		
		br.close();
	}

}

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Divider
{	

	// A function that loads a natural number
	public static int readNumber()
	{
		System.out.println("Enter value: ");
		Scanner scanner = new Scanner(System.in);
		int lnNumber = scanner.nextInt();
		
		return lnNumber;
	}	
	
	// Function chcecking modulo for the read natural number and given value
	public static boolean checkDivider(int lnNumber, int divider)
	{
		if ((lnNumber % divider) == 0)
			return true;

		return false;
	}
	
	// A function that finds divisors for a given natural number	
	public static int[] findDividers()
	{
		int lnNumber = readNumber();
		int tabSize = 50;
		ArrayList<Integer> tabDividers = new ArrayList<>(tabSize);

		if (lnNumber != 0)
		{
			for (int i = 1; i <= lnNumber / 2; i++)		
			{
				if (checkDivider(lnNumber, i))		
				{
					tabDividers.add(i);			
				}
			}

			tabDividers.add(lnNumber);        
		}
		else System.out.println("Does not divide by 0");
		
		// Stream an Array to Integer[]
		return tabDividers.stream().mapToInt(Integer::valueOf).toArray();		
	}

	// Function displaying an array with dividers
	public static void printDivider()
	{

		int[] result = findDividers();
		// Convert to String to display divisor arrays
		System.out.println(Arrays.toString(result)); 
	}
	
	public static void main(String[] args)
	{
		printDivider();
	}
}

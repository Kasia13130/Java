/** Program that calculates the average value of the marks 
and returns the highest grade */

import java.util.Scanner;
import java.util.Arrays;

// the gradeAverage class starts below
public class gradeAverage
{
	// a function that calculates the average
	public static double average(int[] marks)
	
	{
			int sum = 0;
			
			for(int i = 0; i < marks.length; i++)
			{
				sum += marks[i];
			}
			return sum / (double)marks.length;
	}
	
	// top reting function maxMark
	public static int maxMark(int[] marks)
	{
		int length = marks.length;
		int max = marks[0];
		
		for (int i = 0; i < length; i++)
		{
			if (marks[i] > max)
				max = marks[i];
		}
		return max;
	}
	/* main method in which grades are entered, the returned average 
	and highest grade are displayed*/
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of marks:");

		int n = scanner.nextInt();
		System.out.println("Enter marks:");

		int [] marks = new int [n];
		for (int i = 0; i < n; i++)
		{
			marks[i] = scanner.nextInt();
			
		}
		
		System.out.println("List of grades: " + Arrays.toString(marks));	// display of the entered ratings
		System.out.println("Average: " + average(marks));					// display the average
		System.out.println("The highest mark: " + maxMark(marks));			// displaying the highest rating
	}
	
}
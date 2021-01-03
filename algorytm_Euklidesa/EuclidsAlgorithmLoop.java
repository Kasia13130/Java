// Algorytm z uzyciem petli

import java.util.Scanner;

public class EuclidsAlgorithmLoop
{
	public static int NWD(int x, int y)
	{
		if(x==y)
		{
			System.out.println("The values are the same: " + x + ", "+ y);
			return x;
		}
		else
		{	
		
			while (x != y)
			{
				if (x > y)
				{
					x = x - y;
				}
				
				else if (y > x)
				{
					y = y - x;
				}

			}
			System.out.println("Highest common divisor: " + x);
			return x;
		}
	}	
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values x and y");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		NWD(x, y);
	}
}



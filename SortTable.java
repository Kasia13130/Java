/* W zaleznosci od ilosci elementow czas sie wydłuza, z reguly miedzy sortowaniem dla 100 i 500 elementow
czas sie wydluza o okolo 10 ms; przy 1000 elementach czas spada o okolo polowe roznicy poprzednich dwoch sortowan, 
przy ostatnim sortowaniu dla 2500 elementow obserwuje sie najdluzszy czas, o polowe dluzszy od pierwszego*/
import java.time.*;
import java.util.*;

public class SortTable
{
    public static void main(String[] args)
    {
		TableSort(100);
		TableSort(500);
		TableSort(1000);
		TableSort(2500);
	}
	public static void TableSort(int size)
	{
        int[] tab = new int[size];
        Random random = new Random();
		int[] sortedTab;
		
		long start = System.currentTimeMillis();
		long sortStart = System.currentTimeMillis();
		
		System.out.println("Table for: " + size + " elements");

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = random.nextInt(201);
            System.out.print(tab[i]);
			
			if(tab.length-1 != i)
			{
				System.out.print(", ");
			}
	
        }
		
		Arrays.sort(tab);
		System.out.println("\nAfter sort:");
		
		for (int i = 0; i < tab.length; i++)
        {	
			
			System.out.print(Integer.toString(tab[i]));
			
			if(tab.length-1 != i)
			{
				System.out.print(", ");
			}
		}

		long finsh = System.currentTimeMillis();
		long timeElapsed = finsh - start;
		long sortFinish = System.currentTimeMillis();
		long sortTimeElapsed = sortFinish - sortStart;
		
		System.out.println("\nTime for " + size + " elements, before sorted: " + timeElapsed);
		System.out.println("Time for table after sorted: " + sortTimeElapsed);
		
	}
}

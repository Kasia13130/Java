/*
* ad 1: Roznice widac przy sortowaniu 100 elementow gdyz przy sortowaniu przez wstawianie wynisi ona o okolo
* 11 ms wiecej w porownaniu do sortowania przez wybieranie oraz przy 10000 elementach sortowanie
* przez wybieranie jest wolniejsze o okolo 20 ms. Tylko w przypadku 500 i 1000 nie widac znaczacej roznicy w czasie.
* Roznica w czasach dla obu sortowan nie powinna byc znaczaca.
* ad 2: Oba algorytmy maja ta sama zlozonosc obliczeniowa O(n^2)
* */
import java.util.Random;
import java.util.Arrays;

public class Sort
{
    public static void main(String[] args)
    {

        SelectSort(100);
        SelectSort(500);
        SelectSort(1000);
        SelectSort(10000);

        InsertSort(100);
        InsertSort(500);
        InsertSort(1000);
        InsertSort(10000);
    }
    // sortowanie przez wstawianie
    public static void SelectSort(int size)
    {
        Random random = new Random();
        int[] tab = new int[size];

        long start = System.currentTimeMillis();
        long sortTimeStart = System.currentTimeMillis();

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = random.nextInt(50);
        }

        int startSort;
        int index;
        int minValue;
        System.out.println("Przed sortowaniem przez wstawianie: " + size + " elementow\n" + Arrays.toString(tab));

        for (startSort = 0; startSort < tab.length - 1; startSort++)
        {
            minValue = tab[startSort];

            for (index = startSort + 1; index < tab.length; index++)
            {
                if (tab[index] < minValue)
                {
                    minValue = tab[index];
                    tab[index] = tab[startSort];
                    tab[startSort] = minValue;
                }

            }
        }
        long finsh = System.currentTimeMillis();
        long timeElapsed = finsh - start;
        long sortFinish = System.currentTimeMillis();
        long sortTimeElapsed = sortFinish - sortTimeStart;

        System.out.println("Czas przed: " + timeElapsed + " po sortowaniu: " + sortTimeElapsed + "\n" + Arrays.toString(tab) +"\n");

    }
    // sortowanie przez wybieranie
    public static void InsertSort(int size)
    {
        Random random = new Random();
        int[] tab = new int[size];

        long start = System.currentTimeMillis();
        long sortTimeStart = System.currentTimeMillis();
        
        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = random.nextInt(50);
        }

        // wyszukanie najmniejszego elementu
        int minValue;
        System.out.println("Przed sortowaniem przez wybieranie: " + size + " elementow\n" + Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++)
        {
            minValue = i;
            for (int y = i + 1; y < tab.length; y++)
            {
                if (tab[y] < tab[minValue]) {
                    minValue = y;
                }
            }
            // zmiana pozycji
            if (i != minValue)
            {
                int value = tab[i];
                tab[i] = tab[minValue];
                tab[minValue] = value;

            }
        }
        long finsh = System.currentTimeMillis();
        long timeElapsed = finsh - start;
        long sortFinish = System.currentTimeMillis();
        long sortTimeElapsed = sortFinish - sortTimeStart;

        System.out.println("Czas przed: " + timeElapsed + " po sortowaniu: " + sortTimeElapsed + "\n" + Arrays.toString(tab) +"\n");
    }
}



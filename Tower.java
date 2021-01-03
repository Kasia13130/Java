import java.util.Scanner;

public class Tower
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz ilosc dyskow:");
        int number = scanner.nextInt();
        tower(number, "x", "y", "z");
    }

    public static void tower(int disc, String start, String end, String buffer)
    {
        if (disc == 1)
        {
            System.out.println("Przeniesienie dysku " + disc + " z slupka " + start + " na slupek " + end);
            return;
        }
        tower(disc - 1, start, buffer, end);
        System.out.println("Przeniesienie dysku " + disc + " z slupka " + start + " na slupek " + end);
        tower(disc - 1, buffer, end, start);
    }
}

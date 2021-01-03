import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;

public class Library {

    private static String[] BOOKS =
            {
                    "Priests Of Dawn",
                    "Chicken Abroad",
                    "Lord With Sins",
                    "Chicken Abroad",
                    "Fish And Horses",
                    "Mistress Of Devotion",
                    "Bandit Of The Void",
                    "Lord With Sins",
                    "Guardians And Gangsters",
                    "Lions Of Dread",
                    "Chicken Abroad",
                    "Future Of Fire",
                    "Priests Of Dawn",
                    "Fish And Horses",
                    "Chicken Abroad",
                    "Fish And Horses",
                    "Guardians And Gangsters",
                    "Inception Of Heaven",
                    "Lord With Sins",
                    "Future Of Fire",
                    "Driving Into The Depths",
                    "Starting The Demons",
                    "Maid With Blue Eyes",
                    "Mistress Of Devotion",
                    "Lovers In The Forest",
                    "Fish And Horses",
                    "Maid With Blue Eyes",
                    "Destruction Of The Faceless Ones",
                    "Guardians And Gangsters",
                    "Chicken Abroad"

            };

    // Function for removing duplicates and sorting unique list
    public static void createBookList()
    {
        HashSet<String> booksList = new HashSet<>();
        Collections.addAll(booksList, BOOKS);

        List<String> sortList = new ArrayList<String>(booksList);
        Collections.sort(sortList);
        
        System.out.println("List sorted and no duplicates: " + sortList);
    }

    // Books map function
    public static HashMap<String, Integer> createBooksCounter()
    {

        HashMap<String, Integer> booksCounter = new HashMap<>();

        for (String nextBook : BOOKS)
        {
            countBook(booksCounter, nextBook);
        }

        System.out.println("Map of books: " + booksCounter);

        return booksCounter;
    }

    // Function updating the number of occurrences of given book in the map
    public static void countBook(HashMap<String, Integer> booksCounter, String book)
    {
        if (!booksCounter.containsKey(book))
        {
            booksCounter.put(book, 1);
        }
        else
        {
            Integer b = booksCounter.get(book);
            booksCounter.put(book, b + 1);
        }

    }

    // Function to find White Ravens on a book map
    public static ArrayList<String> findWhiteRavens(HashMap<String, Integer> booksCounter)
    {
        ArrayList<String> whiteRavens = new ArrayList<>();

        for (String nextBook : booksCounter.keySet())
        {
            Integer nBook = booksCounter.get(nextBook);
            if (nBook == 1)
            {
                whiteRavens.add(nextBook);
            }
        }

        return whiteRavens;
    }

    // Function that displays White Ravens
    public static void printWhiteRavens(ArrayList<String> whiteRavens)
    {
        System.out.println("The list of white Ravens: " + whiteRavens);
    }

    public static void main(String[] args)
    {
        ArrayList<String> list;
        list = findWhiteRavens(createBooksCounter());

        printWhiteRavens(list);

        createBookList();
    }
}
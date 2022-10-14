import java.util.Scanner;
public class Main
    {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            Fiction titleBook = new Fiction(choice);
            NonFiction titleBooks = new NonFiction(choice);
            System.out.print("*FICTION BOOK*");
            System.out.print("\nBOOK TITLE: " + titleBook.gettitle());
            System.out.print("\nBOOK PRICE: Php"+titleBook.getPrice());
            System.out.print("\n*NONFICTION BOOK*");
            System.out.print("\nBOOK TITLE: " + titleBooks.gettitle());
            System.out.print("\nBOOK PRICE: Php"+titleBooks.getPrice());
        }
    }

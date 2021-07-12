import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book1 books[] = new Book1[3];
        books[0] = new Book1("0001", "S1", 15000, 5, "Nam1");
        books[1] = new Book1("0002", "S2", 18000, 5, "Nam2");
        books[2] = new Book1("0003", "S1", 19000, 5, "Nam3");



        HandlingBook Van = new HandlingBook();
        HandlingBook.setBooks(books);
        Book1 bai1[] = HandlingBook.getBooks();

        Scanner input = new Scanner(System.in);


    }
}
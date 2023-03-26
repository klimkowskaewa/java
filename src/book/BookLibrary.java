package book;

public class BookLibrary {
    public static void main(String[] args) {

        Book[] books = {
                new Book("The Return of the King", "J.R.R. Tolkien", "HarperCollins", 2018),
                new Book("The Return of the King", "J.R.R. Tolkien", "HarperCollins", 2018),
                new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "HarperCollins", 2017),
        };

        Book book1 = books[0];
        Book book2 = books[1];
        Book book3 = books[2];

        System.out.println("book.Book 1: " + book1);
        System.out.println("book.Book 2: " + book2);
        System.out.println("book.Book 3: " + book3);
        System.out.println();

        System.out.print("Compare book 1 and 2:");
        if (book1.equals(book2)) {
            System.out.println("The same books");
        } else {
            System.out.println("Different books");
        }

        System.out.print("Compare book 2 and 3:");
        if (book2.equals(book3)) {
            System.out.println("The same books");
        } else {
            System.out.println("Different books");
        }
    }

}
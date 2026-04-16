package May;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getDetails() {
        return "Title=" + title + ", Author=" + author;
    }
}

class EBook extends Book {
    double fileSize;
    String format;

    EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public String getDetails() {
        return "Title=" + title + "Author=" + author;
    }
}

class PrintedBook extends Book {
    int pageCount;
    String publisher;

    public PrintedBook(String title, String author, int pageCount, String publisher){
        super(title, author);
        this.pageCount = pageCount;
        this.publisher = publisher;
    }

    @Override
    public String getDetails(){
        return "PrintedBook: " + super.getDetails() + ", PageCount= " + pageCount + ", Publisher= " + publisher;
    }
}

class Library {
    List<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println(book.getDetails());
            System.out.println();
        }
    }
}

public class May31two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            int command = scanner.nextInt();
            if (command == 0) {
                break;
            }
            if (command == 1) {
                String title = scanner.next();
                String author = scanner.next();
                double fileSize = scanner.nextDouble();
                String format = scanner.next();
                library.addBook(new EBook(title, author, fileSize, format));
            } else if (command == 2) {
                String title = scanner.next();
                String author = scanner.next();
                int pageCount = scanner.nextInt();
                String publisher = scanner.next();
                library.addBook(new PrintedBook(title, author, pageCount, publisher));
            } else if (command == 3) {
                library.showAllBooks();
            }
        }
        scanner.close();
    }
}

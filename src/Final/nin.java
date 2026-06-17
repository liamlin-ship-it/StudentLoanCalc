package Final;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private final String title; // title of the book
    private final int price; // price of the book

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Title: " + title + ", Price: " + price + ", Category: " + getCategory();
    }

    public String getCategory() {
        if (title.contains("Java") || title.contains("Python")) {
            return "Programming";
        } else if (title.contains("Cookbook") || title.contains("Food")) {
            return "Cooking";
        } else if (title.contains("Biography") || title.contains("Culture")) {
            return "History";
        } else if (title.contains("Adventure") || title.contains("Horror")) {
            return "Fiction";
        } else {
            return "Other";
        }
    }
}

class BookStore {
    // a variable to store the books in the library
    private final ArrayList<Book> library;

    // constructor to initialize the library as an empty list
    public BookStore() {
        library = new ArrayList<>();
    }

    // a method to add a book to the library
    public void add(Book book) {
        if (book.getPrice() > 0 && !book.getCategory().equals("Other")) {
            library.add(book);
        }
    }

    public String getStatistics() {
        String result;
        String longestTitle = library.getFirst().getTitle();
        String shortestTitle = library.getFirst().getTitle();
        int price = 0;
        for (Book book : library){
            price += book.getPrice();

            String currentTitle = book.getTitle();
            if (currentTitle.length() > longestTitle.length()){
                longestTitle = currentTitle;
            }

            if (currentTitle.length() < shortestTitle.length()){
                shortestTitle = currentTitle;
            }
        }
        result = "Total books: " + library.size() + "; Total price: " + price + "; Longest title: " + longestTitle + "; Shortest title: " + shortestTitle;
        return result;
    }
}

public class nin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create a new BookStore object, where the library contains some books
        BookStore store = new BookStore();

        // Allow the user to add 5 books to the store
        for (int i = 1; i <= 5; i++) {
            // Example input: Java Programming;25
            // (title: Java Programming, price: 25)
            String input = scanner.nextLine();
            String title = input.split(";")[0];
            int price = Integer.parseInt(input.split(";")[1]);

            // create a new Book object with the given title and price
            store.add(new Book(title, price));
        }

        // print the statistics of the library
        System.out.println(store.getStatistics());
    }
}

package pl.sdaacademy.javapoz19programowanie1.books;

import java.util.List;
import java.util.Scanner;

public class BooksViews {
    private Scanner scanner;

    public BooksViews(Scanner scanner) {
        this.scanner = scanner;
    }

    public int startMenu() {
        System.out.println("1. Authors");
        System.out.println("2. Books");
        System.out.println("0. Koniec");
        return getDecisionAfterEnter();


    }


    public int getDecision() {


        return scanner.nextInt();
    }

    public int getBirthYear() {

        return readInAndClearLine();
    }


    public Nation getNation() {

        String nationAsString = scanner.nextLine().trim();
        return Nation.valueOf(nationAsString);

    }

    private int getDecisionAfterEnter() {

        return readInAndClearLine();
    }

    public int authorsMenu(List<Author> authors) {
        authors.stream()
                .forEach((author -> System.out.println(author)));
        System.out.println("");
        System.out.println("1.Find by nation(PL, ENG, USA)");
        System.out.println("2.Find by after birthYear");
        System.out.println("0.Back");
        return getDecision();
    }

    public int booksMenu(List<Book> books) {

        books.forEach(book -> System.out.println(book));

        System.out.println();
        System.out.println("1. Find by after releaseYear");
        System.out.println("2. Search by title");
        System.out.println("3. Search by author");
        System.out.println("0. Back");
        System.out.println();

        return getDecision();

    }


    public int getReleaseYear() {


        return readInAndClearLine();
    }


    private int readInAndClearLine() {


        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public String getPhrase() {
        return scanner.nextLine().trim();
    }
}

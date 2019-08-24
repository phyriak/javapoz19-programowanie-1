package pl.sdaacademy.javapoz19programowanie1.books;

import pl.sdaacademy.javapoz19programowanie1.books.Author;

public class Book {
    private String title;
    private int releaseYear;
    private int pages;
    private Author author;

    public Book() {
    }

    public Book(String title, int releaseYear, int pages, Author author) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", pages=" + pages +
                ", author=" + author.getFirstName() +" "+author.getLastName()+
                '}';
    }
}

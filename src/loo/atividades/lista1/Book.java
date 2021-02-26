package loo.atividades.lista1;
/**
 * @author Matheus Rocha
 * @version 1.0
 */

public class Book {
    private String author;
    private String title;
    private int pages;
    private String numReference;
    private Integer borrowed;

    /**
     *
     * @param author, The name of the book's author
     * @param title, The name of the Author's book
     * @param pages, Number of pages in the book
     */

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.numReference = "";
        this.borrowed = 0;
    }

    /**
     *  Increases 1 for the number of times the book was borrowed
     */

    public void loan() {
        this.borrowed++;
    }

    /**
     * @return The name of the book's author
     */

    public String getAuthor() {
        return author;
    }

    /**
     * @return The name of the Author's book
     */

    public String getTitle() {
        return title;
    }

    /**
     * @return The number of pages in the book
     */

    public int getPages() {
        return pages;
    }

    /**
     * @return The number of times the book was borrowed
     */

    public int getBorrowed() {
        return borrowed;
    }

    /**
     *
     * @param numReference, The reference to an specific page in the book
     */

    public void setNumReference(String numReference) {
        if(numReference.length() >= 3)
            this.numReference = numReference;

    }

    public void printAuthor() {
        System.out.println("Author: " + this.author);
    }

    public void printTitle() {
        System.out.println("Title: " + this.title);
    }

    public void printDetails() {
        System.out.println("Book:\n\tAuthor: " + getAuthor());
        System.out.println("\tTitle: " + getTitle());
        System.out.println("\tPages: " + getPages());
        System.out.println("\tBorrowed: " + borrowed + " times");

        if(this.numReference.equals("")) {
            System.out.println("\tNumRef: ZZZ");
        } else {
            System.out.println("\tNumRef: " + this.numReference);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

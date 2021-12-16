package com.company;

import java.util.Objects;

public class Book {
    private Author author;
    private String bookName;
    private int publicationYear;
    public static int bookCounter = 0;

    public Book(Author author, String bookName, int publicationYear) {
        this.author = author;
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        bookCounter++;
    }

    public Author getAuthor() {
        return author;
    }

    public static int getBookCounter() {
        return bookCounter;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void printBook() {
        System.out.println("Книга № "+ Book.getBookCounter() + " в библиотеке: Автор: " + author.getAuthorName() + " "+ author.getAuthorSurname() +
                " Название: " + bookName +  " Год издания: " + publicationYear);
    }
    @Override
    public String toString(){
        return String.format("%s %s: %s: %d",
                this.author.getAuthorName(),
                this.author.getAuthorSurname(),
                this.bookName,
                this.publicationYear
        );
        }

    @Override
    public boolean equals(Object other) {
        if (this.bookName == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}

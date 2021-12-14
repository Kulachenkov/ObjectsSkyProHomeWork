package com.company;

public class Book {

    private Author author;

    private String bookName;
    private int publicationYear;

    public Book(Author author, String bookName, int publicationYear) {
        this.author = author;
        this.bookName = bookName;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
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
}

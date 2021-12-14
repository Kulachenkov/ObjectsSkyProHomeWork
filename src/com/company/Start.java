package com.company;

public class Start {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoi = new Author("Лев", "Толстой");

        Book firstBook = new Book(tolstoi, "Война и мир", 1975);
        Book secondBook = new Book(pushkin, "Евгений Онегин", 1965);

        System.out.println("Книга № 1 в библиотеке: Автор: " + tolstoi.getAuthorName() + " " + tolstoi.getAuthorSurname() + " " +
                 " Название: " + firstBook.getBookName() +  " Год издания: " + firstBook.getPublicationYear());

        System.out.println("Книга № 1 в библиотеке: Автор: " + pushkin.getAuthorName() + " " + pushkin.getAuthorSurname() + " " +
                " Название: " + secondBook.getBookName() +  " Год издания: " + secondBook.getPublicationYear());


        firstBook.setPublicationYear(1990);

        System.out.println("Книга № 1 в библиотеке: Автор: " + tolstoi.getAuthorName() + " " + tolstoi.getAuthorSurname() + " " +
                " Название: " + firstBook.getBookName() +  " Год издания: " + firstBook.getPublicationYear());


    }
}

package com.company;

public class Start {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoi = new Author("Лев", "Толстой");

        Book firstBook = new Book(tolstoi, "Война и мир", 1975);
        firstBook.printBook();
        Book secondBook = new Book(pushkin, "Евгений Онегин", 1965);
        secondBook.printBook();
        firstBook.setPublicationYear(1990);
        firstBook.printBook();



    }
}

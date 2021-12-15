package com.company;

public class Start {

    private static Book [] books = new Book[5];

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoi = new Author("Лев", "Толстой");
        Book firstBook = new Book(tolstoi, "Война и мир", 1975);
        Book secondBook = new Book(pushkin, "Евгений Онегин", 1965);
        books[0] = firstBook;
        books[1] = secondBook;
        printBooks();
        books[1].setPublicationYear(1990);
        printBooks();

    }
    public static void printBooks(){
        int count = 0;
        for (Book book : books) {
            if(book != null) {
                count++;
                System.out.print(count + ". ");
                System.out.println(book);
            }
        }
    }
}

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

        Author tolstoiTwo = new Author("Лев", "Толстой");
        Book thirdBook = new Book(tolstoiTwo, "Война и мир", 1975);
        books[2] = thirdBook;
        printBooks();
        System.out.println(tolstoi.equals(tolstoiTwo));
        System.out.println(tolstoi.hashCode());
        System.out.println(tolstoiTwo.hashCode());
        System.out.println(thirdBook.equals(firstBook));

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

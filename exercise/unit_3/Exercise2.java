package exercise.unit_3;

import java.util.Scanner;

import exercise.unit_3.Exercise1.Book;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[2];

        for (int i = 0; i < books.length; i++) {
            System.out.print("Input Book's Title and Author: ");
            String[] inputs = scanner.nextLine().split(" ");
            String title = inputs[0];
            String author = inputs[1];

            books[i] = new Book(title, author);
        }

        for (Book book : books) {
            book.printBook();
        }

        System.out.print("Input Book's Price: ");
        books[1].setPrice(scanner.nextInt());
        books[1].printBookWithPrice();

        scanner.close();
    }
}

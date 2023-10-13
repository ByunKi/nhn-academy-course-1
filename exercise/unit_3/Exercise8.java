package exercise.unit_3;

import java.util.Scanner;

import exercise.unit_3.Exercise1.Book;
import exercise.unit_3.Exercise7.Novel;
import exercise.unit_3.Exercise7.TextbookOfBolzano;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");
        String title = inputs[0];
        String author = inputs[1];
        String course = inputs[2];
        String faculty = inputs[3];

        TextbookOfBolzano textBook = new TextbookOfBolzano(title, author, course, faculty);
        textBook.printBook();

        inputs = scanner.nextLine().split(" ");
        title = inputs[0];
        author = inputs[1];
        Book tmpBook = new Book(title, author);
        Novel novel = new Novel(tmpBook, "SF");
        tmpBook.printBook();
        novel.printBook();

        textBook.setPrice(37500);
        textBook.printBookWithPrice();

        scanner.close();
    }
}

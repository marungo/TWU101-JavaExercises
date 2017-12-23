package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.util.Arrays;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        Arrays.stream(books)
                .filter(book -> book.contains(partialBookTitle))
                .forEach(book -> printStream.println(book));
        printStream.println();
    }
}

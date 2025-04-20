package com.xworkz.methodoverriding.book;

public class BookRunner {
        public static void main(String[] args) {
            Book book = new Book();
            book.open();
            book.read();
            book.close();
            book.bookmark();
            System.out.println();

            Book eb = new EBook();
            eb.open();
            eb.read();
            eb.close();
            eb.bookmark();
            System.out.println();

            EBook eBook = new EBook();
            eBook.open();
            eBook.read();
            eBook.close();
            eBook.bookmark();
        }
    }



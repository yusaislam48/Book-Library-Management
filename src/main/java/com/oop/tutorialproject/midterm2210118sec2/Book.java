package com.oop.tutorialproject.midterm2210118sec2;

public class Book {
    private int bookId;
    private String bookTitle;
    private String bookGenre;
    private float price;
    private static int noOfBooks;

    public Book(int bookId, String bookTitle, String bookGenre, float price) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookGenre = bookGenre;
        this.price = price;

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getNoOfBooks() {
        return noOfBooks;
    }

    public static void setNoOfBooks(int noOfBooks) {
        Book.noOfBooks = noOfBooks;
    }
}

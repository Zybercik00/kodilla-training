package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;


public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase)
    {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
            if (titleFragment.length() < 3)
            return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
            if (resultList.size() > 20)
            return bookList;
        bookList = resultList;
            return bookList;
    }


    public List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
            System.out.println(theBook);

        }
        return resultList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> booksInHand = libraryDatabase.listBooksInHandsOf(libraryUser);
        return booksInHand;
    }



    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary(null);
        bookLibrary.generateListOfNBooks(9);


    }

}

package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        Library library = new Library("Home");
        library.getBooks().add(new Book("Hobbit", "Tolkien",  LocalDate.of(1990, 5, 23)));
        library.getBooks().add(new Book("Druga strona", "Golkowski",  LocalDate.of(2000, 7, 12)));
        library.getBooks().add(new Book("Wladca Pierscieni", "Tolkien",  LocalDate.of(1988, 10, 27)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Main");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Public");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}

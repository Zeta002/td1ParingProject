package net.quentin;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void getName() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Library l1 = new Library("lib1","qqchose",30,myLibrary);
        l1.addBook(B1);
        l1.addBook(B2);
        assertEquals("lib1",l1.getName());

    }

    @Test
    void setName() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Library l1 = new Library("lib1","qqchose",30,myLibrary);
        l1.addBook(B1);
        l1.addBook(B2);
        l1.setName("lib11");
        assertEquals("lib11",l1.getName());
    }

    @Test
    void getAddress() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Library l1 = new Library("lib1","qqchose",30,myLibrary);
        l1.addBook(B1);
        l1.addBook(B2);
        assertEquals("qqchose",l1.getAddress());
    }

    @Test
    void setAddress() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Library l1 = new Library("lib1","qqchose",30,myLibrary);
        l1.addBook(B1);
        l1.addBook(B2);
        l1.setAddress("nouvelleAdr");
        assertEquals("nouvelleAdr",l1.getAddress());
    }

    @Test
    void getMax() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Library l1 = new Library("lib1","qqchose",30,myLibrary);
        l1.addBook(B1);
        l1.addBook(B2);
        assertEquals(30,l1.getMax());
    }

    @Test
    void setMax() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Library l1 = new Library("lib1","qqchose",30,myLibrary);
        l1.addBook(B1);
        l1.addBook(B2);
        l1.setMax(50);
        assertEquals(50,l1.getMax());
    }


    @Test
    void addBook() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POINTEUR","BOB","CROUS",10);
        Library l1 = new Library("lib1","qqchose");
        ArrayList<Book> l2 = new ArrayList<>();
        l2.add(B1);
        l2.add(B2);
        l1.addBook(B1);
        l1.addBook(B2);
        assertEquals(l2,l1.getBookList());
    }

    @Test
    void removeBook() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POINTEUR","BOB","CROUS",10);
        Library l1 = new Library("lib1","qqchose");
        ArrayList<Book> l2 = new ArrayList<>();
        l2.add(B1);
        l2.add(B2);
        l2.remove(B1);
        l1.addBook(B1);
        l1.removeBook(B1);
        l1.addBook(B2);
        assertEquals(l2,l1.getBookList());
    }


    @Test
    void removeDuplicates() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B3 = B1;
        Library l1 = new Library("lib1","qqchose");
        Library l2 = new Library("lib1","qqchose");
        l1.addBook(B1);
        l1.addBook(B2);
        l2.addBook(B1);
        l2.addBook(B2);
        l1.addBook(B3);
        l1.setMax(50);
        l1.removeDuplicates();
        assertEquals(l2.getBookList(), l1.getBookList());
    }

    @Test
    void booksInCommon() {
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTBEUR","JK","PHPStorm",50);
        Library l1 = new Library("lib1","qqchose");
        Library l2 = new Library("lib2","qqchose");
        l1.addBook(B1);
        l1.addBook(B2);
        l2.addBook(B1);
        assertEquals(true, l1.booksInCommon(l2));
    }

    @Test
    void sortByAuthor(){
        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POINTEUR","BOB","CROUS",10);
        Book B3 = new Book("FF15","RayoUwU","Romain",15);
        Library l1 = new Library("lib1","qqchose");
        ArrayList<Book> l2 = new ArrayList<>();
        l2.add(B2);
        l2.add(B1);
        l2.add(B3);
        l1.addBook(B1);
        l1.addBook(B2);
        l1.addBook(B3);
        l1.sortByAuthor();
        assertEquals(l2,l1.getBookList());
    }
}
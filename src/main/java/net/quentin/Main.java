package net.quentin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book B1 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);
        Book B2 = new Book("Harry POTDEBEUR","JK","PHPStorm",50);

        System.out.println(B1.equals(B2));
        System.out.println(B1==B2);
        System.out.println(B1.getAuthor());
        System.out.println(B1.getEditor());
        System.out.println(B1.getTitle());
        System.out.println(B1.getPageNb());
        System.out.println(B1);
        B1.setAuthor("Sokhna");
        B1.setEditor("Nathan");
        B1.setPageNb(1000);
        B1.setTitle("Comment je suis devenue chef de projet java");
        System.out.println(B1);

        ArrayList<Book> myLibrary = new ArrayList<Book>();

        Library l1 = new Library("IUT Info", "IUT aix-m", 10, myLibrary);

        l1.addBook(B1);
        l1.addBook(B2);
        l1.addBook(B2);
        System.out.println(l1);
        l1.removeDuplicates();
        System.out.println(l1);
        System.out.println(l1.getBookList());


    }
}
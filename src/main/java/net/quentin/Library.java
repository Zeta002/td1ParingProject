package net.quentin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private final int MAX_BOOKS = 100;
    private String name;
    private String address;
    private int max;
    private ArrayList<Book> bookList = new ArrayList<>(MAX_BOOKS);

    public Library(String name, String address, int max, ArrayList<Book> bookList) {
        this.name = name;
        this.address = address;
        this.max = max;
        this.bookList = bookList;
    }
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        bookList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }



    public void addBook(Book book){
        bookList.add(book);
    }

    public void removeBook(Book book){
        if (bookList.contains(book)){
            bookList.remove(book);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "MAX_BOOKS=" + MAX_BOOKS +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", max=" + max +
                ", bookList=" + bookList +
                '}';
    }

    public void removeDuplicates(){
        List<Book> nazurf = bookList.stream().distinct().toList();
        bookList = new ArrayList<>(nazurf);
    }

    public boolean booksInCommon(Library library){
        boolean haveCommon = false;
        for(Book book : this.bookList){
            if(library.getBookList().contains(book)){
                System.out.println(book);
                haveCommon = true;
            }
        }
        return haveCommon;
    }

    public void sortByAuthor(){
       bookList.sort(Comparator.comparing(Book::getAuthor));
    }


}
